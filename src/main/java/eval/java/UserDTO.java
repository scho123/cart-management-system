package eval.java;

public class UserDTO {

    private int userNum;
    private String userId;
    private String userPw;

    public UserDTO() {}

    public UserDTO(int userNum, String userId, String userPw) {
        this.userNum = userNum;
        this.userId = userId;
        this.userPw = userPw;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userNum=" + userNum +
                ", userNum='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                '}';
    }
}
