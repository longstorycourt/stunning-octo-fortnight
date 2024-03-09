package Inheritance;

class One{
    public void printOne(){
        System.out.println("One!");
    }
}
class Two extends One{
    public void printTwo(){
        System.out.println("Two!");
    }
}
class Three extends Two{
    public void printThree(){
        System.out.println("Three!");
    }
}
public class MultiplelevelTest {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.printOne();
        obj.printTwo();
        obj.printThree();
    }
}
