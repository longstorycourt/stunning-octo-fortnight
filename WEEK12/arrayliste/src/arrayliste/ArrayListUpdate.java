package arrayliste;

import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {
        try{
            //Creating object of ArrayList <Integer>
            ArrayList <Integer> arrlist = new ArrayList<Integer>();
            //Populating arrlist1
            arrlist.add(1);
            arrlist.add(2);
            arrlist.add(3);
            arrlist.add(4);
            arrlist.add(5);
            //print arrlist
            System.out.println("Before operation: "+ arrlist);
            //Replacing element at the index 3 with 30
            //Using method set()
            int i = arrlist.set(3,30);
            //Print the modified arrlist
            System.out.println("After operation: " +arrlist);
            //Print the replaced element
            System.out.println("Replaced element: " + i);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+ e);
        }
    }
}
