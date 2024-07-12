package eval.java;

import java.util.List;

public class CartController {

    private View view = new View();
    private Cart cart = Cart.getInstance();

    public void viewCart(int userNum) {
        List<ItemDTO> list = cart.getCart(userNum);
        if (list != null) {
            view.viewCartItems(list);
        } else {
            view.displayMessage("장바구니가 비어있습니다.");
        }
    }

    public void addToCart(int userNum) {
        Boolean isSuccess = cart.addToCart(userNum);
        if (isSuccess) {
            view.displayMessage("장바구니에 아이템 추가 완료");
        } else {
            view.displayMessage("이미 장바구니에 추가된 아이템입니다.");
        }
    }

    public void deleteFromCart(int userNum) {
        if ((cart.getCart(userNum) == null)) {
            view.displayMessage("삭제할 아이템이 조회되지 않습니다.");
            return;
        }

        Boolean isSuccess = cart.deleteFromCart(userNum);
        if (isSuccess) {
            view.displayMessage("장바구니에서 해당 아이템 삭제 완료");
        } else {
            view.displayMessage("삭제할 아이템이 조회되지 않습니다.");
        }
    }

    public void emptyCart(int userNum) {
        if ((cart.getCart(userNum) == null)) {
            view.displayMessage("삭제할 아이템이 조회되지 않습니다.");
            return;
        }

        Boolean isSuccess = cart.emptyCart(userNum);
        if (isSuccess) {
            view.displayMessage("장바구니 비우기 완료");
        }
    }


    public void viewAllUsersCarts() {
        cart.viewAllUsersCarts();
    }
}
