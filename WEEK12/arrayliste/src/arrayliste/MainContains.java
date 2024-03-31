package arrayliste;

import java.util.ArrayList;

public class MainContains {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //use add() method to add elements in the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        if (list.contains(5))
            System.out.println("5 exists in the ArrayList.");
        else 
            System.out.println("5 does not exist in the ArrayList.");
        if (list.contains(2))
            System.out.println("2 exists in the ArrayList.");
        else 
            System.out.println("2 does not exist in the ArrayList.");
    }
}
