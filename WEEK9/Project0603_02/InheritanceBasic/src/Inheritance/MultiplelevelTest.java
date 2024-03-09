package Inheritance;
class one{
    public void print_One(){
        System.out.println("One!");
    }
}
class two extends one{
    public void print_Two(){
        System.out.println("Two!");
    }
}
class three extends two{
    public void print_Three(){
        System.out.println("Three!");
    }
}
public class MultiplelevelTest{
    public static void main(String[] args) {
        three obj = new three();
        obj.print_One();
        obj.print_Two();
        obj.print_Three();
    }
}