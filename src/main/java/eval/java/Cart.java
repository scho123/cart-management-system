package eval.java;

import java.util.*;

public class Cart {

    private Map<Integer, List<ItemDTO>> shoppingCart;

    private static Cart instance;
    private Cart() {
        shoppingCart = new HashMap<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    Scanner sc = new Scanner(System.in);

    // hidden menu
    public void viewAllUsersCarts() {
        for (Map.Entry<Integer, List<ItemDTO>> entry : shoppingCart.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            for (ItemDTO item : entry.getValue()) {
                System.out.println("Item Num: " + item.getItemNum() + ", Item Name: " + item.getItemName() + ", Item Price: " + item.getItemPrice());
            }
        }
    }

    public Boolean addToCart(int userNum) {
        System.out.print("추가할 아이템의 고유 번호(정수) : ");
        int itemNum = sc.nextInt();
        sc.nextLine();
        System.out.print("추가할 아이템명 : ");
        String itemName = sc.nextLine();
        System.out.print("추가할 아이템 가격 : ");
        double itemPrice = sc.nextDouble();

        ItemDTO newItem = new ItemDTO(itemNum, itemName, itemPrice);

        if (shoppingCart.containsKey(userNum)) {
            Boolean isDuplicate = checkDuplicate(userNum, itemNum);
            if (isDuplicate) return false;
            else {
                List<ItemDTO> itemList = shoppingCart.get(userNum);
                itemList.add(newItem);
                return true;
            }
        } else {
            List<ItemDTO> itemList = new ArrayList<>();
            itemList.add(newItem);
            shoppingCart.put(userNum, itemList);
            return true;
        }
    }

    public Boolean checkDuplicate(int userNum, int itemNum) {
        List<ItemDTO> itemList = shoppingCart.get(userNum);
        for (ItemDTO i : itemList) {
            if (i.getItemNum() == itemNum) {
                return true;
            }
        }
        return false;
    }

    public Boolean deleteFromCart(int userNum) {
        System.out.print("삭제할 아이템의 고유 번호(정수) : ");
        int delNum =  sc.nextInt();

        List<ItemDTO> itemList = shoppingCart.get(userNum);

        if (itemList == null) {
            return false;
        }

        for (ItemDTO i : itemList) {
            if (i.getItemNum() == delNum) {
                itemList.remove(i);
                return true;
            }
        }

        return false;
    }

    public List<ItemDTO> getCart(int userNum) {
        return shoppingCart.get(userNum);
    }

    public Boolean emptyCart(int userNum) {
        if (shoppingCart.containsKey(userNum)) {
            shoppingCart.remove(userNum);
            return true;
        }
        return false;
    }

}
