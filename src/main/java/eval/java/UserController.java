package eval.java;

public class UserController {

    public static boolean isLoggedIn = false;
    public static int userNum;

    private UserList userList;
    private View view;

    public UserController() {
        userList = new UserList();
        view = new View();
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
        }
    }

    // 로그아웃
    public void logOff() {
        userNum = 0;
        isLoggedIn = false;
    }

    public void delete() {
        boolean isSuccess = userList.deleteUser();

        if (isSuccess) {
            userNum = 0;
            isLoggedIn = false;
            view.displayMessage("회원탈퇴 완료");
        }
    }


}
