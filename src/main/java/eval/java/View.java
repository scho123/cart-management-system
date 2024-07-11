package eval.java;

import java.util.List;

public class View {


    public void displayMessage(String msg) {
        System.out.println(msg);
    }

    public void viewCartItems(List<ItemDTO> list) {
        for (ItemDTO i : list) {
            System.out.print(i + " ");
        }
    }
}
