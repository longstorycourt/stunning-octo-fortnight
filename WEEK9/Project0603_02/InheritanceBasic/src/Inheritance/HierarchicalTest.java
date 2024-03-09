package Inheritance;
//one superclass, many subclass

class Base{
    public void print_Base(){
        System.out.println("Base!");
    }
}
class Derived1 extends Base{
    public void print_Derived1(){
        System.out.println("Derived1!");
    }
}
class Derived2 extends Base{
    public void print_Derived2(){
        System.out.println("Derived2!");
    }
}
class Derived3 extends Base{
    public void print_Derived3(){
        System.out.println("Derived3!");
    }
}

public class HierarchicalTest {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();
        Derived3 d3 = new Derived3();
        d1.print_Base();
        d1.print_Derived1();
        d2.print_Base();
        d2.print_Derived2();
        d3.print_Base();
        d3.print_Derived3();
    }
}
