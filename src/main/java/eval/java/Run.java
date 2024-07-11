package eval.java;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        /* 회원 장바구니 관리 프로그램 */

        Scanner sc = new Scanner(System.in);
        UserController userController = new UserController();
        CartController cartController = new CartController();

        while (true) {

            if (!UserController.isLoggedIn) {
                System.out.println();
                System.out.println("================ 회원제 쇼핑몰 ================");
                System.out.println("1) 회원 가입");
                System.out.println("2) 회원 로그인");
                System.out.println("0) 쇼핑몰 나가기");
                System.out.print("메뉴를 고르세요 : ");
                int menu = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (menu) {
                    case 1:
                        userController.signUp(); break;
                    case 2:
                        userController.login(); break;
                    case 0: return;
                    default:
                        System.out.println("없는 메뉴입니다.. 메뉴를 다시 선택해 주세요.");
                }

            } else {
                System.out.println();
                System.out.println("================ 회원제 쇼핑몰 ================");
                System.out.println("1) 내 장바구니 조회");
                System.out.println("2) 내 장바구니에 아이템 추가");
                System.out.println("3) 내 장바구니에서 아이템 삭제");
                System.out.println("4) 내 장바구니 비우기");
                System.out.println("5) 로그아웃");
                System.out.println("6) 회원 탈퇴");
                System.out.println("0) 쇼핑몰 나가기");
                System.out.print("메뉴를 고르세요 : ");
                int menu = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (menu) {
                    case 1: cartController.viewCart(); break;
                    case 2: cartController.addToCart(); break;
                    case 3: cartController.deleteFromCart(); break;
                    case 4: cartController.emptyCart(); break;
                    case 5: userController.logOff(); break;
                    case 6: userController.delete(); break;
                    case 0: return;
                    default:
                        System.out.println("없는 메뉴입니다.. 메뉴를 다시 선택해 주세요.");

                }

            }


        }

    }
}
