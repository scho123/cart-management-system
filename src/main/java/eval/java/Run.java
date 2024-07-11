package eval.java;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        /* 회원 장바구니 관리 프로그램 */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("================ 자바 쇼핑몰 ================");
            System.out.println("1) 회원 가입");
            System.out.println("2) 회원 로그인");
            System.out.println("3) 장바구니 조회");
            System.out.println("4) 장바구니 추가");
            System.out.println("5) 장바구니 수정");
            System.out.println("6) 장바구니 비우기");
            System.out.println("7) 회원 탈퇴");
            System.out.println("0) 쇼핑몰 나가기");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("가입 아이디 : ");
                    String id = sc.nextLine();
                    System.out.print("가입 비밀번호 : ");
                    String pw = sc.nextLine();


                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 0: return;
                default:
                    System.out.println("없는 메뉴입니다...");
            }
        }

    }
}
