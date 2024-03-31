package arrayliste;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Object> names = new ArrayList<>();
        names.add("Ronaldo");
        display(names);
        names.add("Vattanaka");
        display(names);
        names.add("Mbappe");
        display(names);
        names.add(2,"Neymar");
        display(names);
        System.out.println("Size of all elements: "+ names.size());
        names.remove(1);
        display(names);
        System.out.println("Size of all elements: "+ names.size());
        names.set(0, "Messi");
        display(names);
    }

    public static void display(ArrayList names){
        System.out.println("\nThe size of the list is "+ names.size());
        for(int i =0; i<names.size(); ++i)
            System.out.println("Position " + i + " Name: "+ names.get(i));
    }
}
