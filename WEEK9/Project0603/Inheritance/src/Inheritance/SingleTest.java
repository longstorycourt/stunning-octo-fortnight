//Single Inheritance

package Inheritance;
class One { //super class (base class)
    public void print_One(){
        System.out.println("One!");
    }
}
class Two extends One { //subclass (derived class)
    public void print_Two(){
        //print_One();
        System.out.println("Two!");
    }
}

public class SingleTest {
    public static void main(String[] args) {
        //Two obj = new Two();
        One obj = new One();
        obj.print_One();
        //obj.print_Two();
    }
}
