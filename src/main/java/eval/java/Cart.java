package eval.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private Map<Integer, List<ItemDTO>> shoppingCart;

    public Cart() {
        shoppingCart = new HashMap<>();
    }


    public void addToCart(int userNum, List<ItemDTO> itemList) {
        shoppingCart.put(userNum, itemList);
    }

    public Boolean deleteFromCart(int userNum, int delItem) {
        if (userNum != 0) {
            List<ItemDTO> list = shoppingCart.get(userNum);

            for (ItemDTO i : list) {
                if (i.getItemNum() == delItem) {
                    list.remove(i);

                    return true;
                }
            }

        }
        return false;
    }

    public List<ItemDTO> getCart(int userNum) {
        return shoppingCart.get(userNum);
    }

    public Boolean emptyCart(int userNum) {
        if (userNum != 0) {
            shoppingCart.remove(userNum);
            return true;
        } else {
            return false;
        }

    }

}
