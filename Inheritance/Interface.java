package Inheritance;

interface One1{
    public void printOne();
}
interface Two2{
    public void printTwo();
}
interface Three3 extends Two2, One1{
    public void printThree();
}
class Child implements Three3{
    public void printOne(){
        System.out.println("One!");
    }
    public void printTwo(){
        System.out.println("Two!");
    }
    public void printThree(){
        System.out.println("Three!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Child c = new Child();
        c.printOne();
        c.printTwo();
        c.printThree();
    }
}
