package pkginterface;
interface NewYear{
    void welcome();
}
class Khmer implements NewYear{
    public void welcome(){
        System.out.println("Soursdey Chhnam Thmey!!!");
    }
    public void hello(){
        System.out.println("Chumreap Sour!!!");
    }
}
class International implements NewYear{
    public void welcome(){
        System.out.println("Happy New Year!!!");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Khmer k = new Khmer();
        k.welcome();
        International i =new International();
        i.welcome();

        NewYear n;
        n = new Khmer();
        n.welcome();
        n = new International();
        n.welcome();
    }
}
