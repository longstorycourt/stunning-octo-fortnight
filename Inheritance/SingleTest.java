package Inheritance;

class One{
    public void print_One(){
        System.out.println("One!");
    }
}
class Two extends One{
    public void print_Two(){
        System.out.println("Two!");
    }
}
public class SingleTest{
    public static void main(String[] args) {
        Two obj = new Two();
        obj.print_One();
        obj.print_Two();
    }
}