package eval.java;

import java.util.List;

public class CartController {

    private ItemList itemList;
    private View view;
    private Cart cart;

    public CartController() {
        itemList = new ItemList();
        view = new View();
        cart = new Cart();
    }

    public void viewCart() {
        List<ItemDTO> list = cart.getCart(UserController.userNum);
        if (list != null) {
            view.viewCartItems(list);
        } else {
            view.displayMessage("장바구니가 비어있습니다.");
        }
    }

    public void addToCart() {
        List<ItemDTO> list = itemList.addItems();
        cart.addToCart(UserController.userNum, list);
        view.displayMessage("장바구니에 아이템 추가 완료");
    }

    public void deleteFromCart() {
        int delItem = itemList.getDeleteItem();
        Boolean isSuccess = cart.deleteFromCart(UserController.userNum, delItem);
        if (isSuccess) {
            view.displayMessage("장바구니에서 해당 아이템 삭제 완료");
        }
    }

    public void emptyCart() {
        Boolean isSuccess = cart.emptyCart(UserController.userNum);
        if (isSuccess) {
            view.displayMessage("장바구니 비우기 완료");
        }
    }




}
