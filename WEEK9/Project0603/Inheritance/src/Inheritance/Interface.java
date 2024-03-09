package Inheritance;

interface One{
    public void printOne();
}
interface Two{
    public void printTwo();
}
interface Three extends One, Two{
    public void printOne();
}
class Child implements Three{
    public void printOne(){
        System.out.println("One!");
    }

    @Override
    public void printTwo() {
        System.out.println("Two!");
        throw new UnsupportedOperationException("Unimplemented method 'printTwo'");
    }
}
public class Interface {
    public static void main(String[] args) {
        Child c = new Child();
        c.printOne();
        c.printTwo();
    }
}
