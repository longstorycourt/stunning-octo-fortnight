package arrayliste;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Collections.sort(cars); //sort in alphabetical order
        // Collections.reverse(cars);
        Collections.sort(cars, Collections.reverseOrder());
        for(String i: cars)
            System.out.println(i);
    }
}
