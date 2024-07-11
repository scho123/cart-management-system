package eval.java;

public class ItemDTO {

    private int itemNum;
    private String itemName;
    private double itemPrice;

    public ItemDTO() {}

    public ItemDTO(int itemNum, String itemName, double itemPrice) {
        this.itemNum = itemNum;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "내 장바구니 {" +
                "아이템 번호=" + itemNum +
                ", 아이템명 ='" + itemName + '\'' +
                ", 아이템 가격=" + itemPrice +
                '}';
    }
}
