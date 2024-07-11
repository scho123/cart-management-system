package eval.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {

    Scanner sc = new Scanner(System.in);

    private List<UserDTO> userList;
    private static int userCnt = 0;

    public UserList() {
        this.userList = new ArrayList<>();
    }

    // 중복 아이디 여부 체크
    public Boolean checkDuplicateId(String id) {
        for (UserDTO u : userList) {
            if (u.getUserId().equals(id)) {
                return true;
            }
        }

        return false;
    }

    // 회원 추가
    public Boolean addUser() {
        System.out.print("가입 아이디 : ");
        String id = sc.nextLine();

        Boolean isDuplicate = checkDuplicateId(id);

        if (isDuplicate) {
            System.out.println("이미 존재하는 아이디가 있습니다.");
        } else {
            System.out.print("가입 비밀번호 : ");
            String pw = sc.nextLine();

            userCnt++;
            UserDTO newUser = new UserDTO(userCnt, id, pw);
            userList.add(newUser);

            return true;
        }

        return false;
    }

    // 회원 로그인
    public UserDTO loginUser() {
        System.out.print("로그인 아이디 : ");
        String id = sc.nextLine();
        System.out.print("로그인 비밀번호 : ");
        String pw = sc.nextLine();

        for (UserDTO u : userList) {
            if (u.getUserId().equals(id) && u.getUserPw().equals(pw)) {
                return u;
            }
        }

        return null;
    }

    public UserDTO getUser() {
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = sc.nextLine();

        for (UserDTO u : userList) {
            if (u.getUserPw().equals(pw)) {
                return u;
            }
        }

        return null;

    }

    public boolean deleteUser() {
        System.out.print("탈퇴할 아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();

        for (UserDTO u : userList) {
            if (u.getUserId().equals(id) && u.getUserPw().equals(pw)) {
                userList.remove(u);
                return true;
            }
        }

        return false;
    }
}
