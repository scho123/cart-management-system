package eval.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemList {

//    Scanner sc = new Scanner(System.in);
//
//    private List<ItemDTO> itemList;
//
//    public ItemList() {
//        this.itemList = new ArrayList<>();
//    }

//    public ItemDTO addItem() {
//        System.out.print("추가할 아이템 고유 넘버(정수) : ");
//        int itemNum = sc.nextInt();
//        sc.nextLine();
//        System.out.print("추가할 아이템명 : ");
//        String itemName = sc.nextLine();
//        System.out.print("추가할 아이템 가격 : ");
//        double itemPrice = sc.nextDouble();
//        sc.nextLine();
//
//        Boolean isCheck = checkDuplicateNum(itemNum);
//
//        if (isCheck) {
//            ItemDTO newItem = new ItemDTO(itemNum, itemName, itemPrice);
//            itemList.add(newItem);
//
//            return newItem;
//        } else {
//            System.out.println("중복되는 아이템 넘버를 입력하셨습니다.");
//        }
//
//        return null;
//    }
//
//    /* 이 부분 수정해야 함 !!!!!*/
//    public Boolean checkDuplicateNum(int num) {
//
//        for (ItemDTO i : itemList) {
//            if (i.getItemNum() == num) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public int getDeleteItem() {
//        System.out.print("삭제할 아이템 넘버(고유 정수 타입 코드) : ");
//        int delNum =  sc.nextInt();
//        return delNum;
//    }
}
