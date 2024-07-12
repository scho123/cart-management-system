package eval.java;

public class UserController {

    private boolean isLoggedIn = false; // Instance variable
    private int userNum;

    private UserList userList;
    private View view;
    private Cart cart = Cart.getInstance();

    public UserController() {
        userList = new UserList();
        view = new View();
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public int getUserNum() {
        return userNum;
    }

    // 회원 가입
    public void signUp() {
        boolean isSuccess = userList.addUser();

        if (isSuccess) {
            view.displayMessage("회원가입 성공!");
        }

    }

    // 회원 로그인
    public void login() {
        UserDTO user = userList.loginUser();
        if (user != null) {
            view.displayMessage(user.getUserId() + "님, 로그인 완료 되셨습니다.");
            isLoggedIn = true;
            userNum = user.getUserNum();
        } else {
            view.displayMessage("아이디나 비밀번호가 틀렸습니다.");
        }
    }

    // 로그아웃
    public void logOff() {
        userNum = 0;
        isLoggedIn = false;
    }

    // 회원탈퇴
    public void delete() {
        boolean isSuccess = userList.deleteUser();

        if (isSuccess) {
            cart.emptyCart(userNum);
            userNum = 0;
            isLoggedIn = false;

            view.displayMessage("회원탈퇴 완료");
        } else {
            view.displayMessage("아이디나 비밀번호가 틀렸습니다.");
        }
    }

}
