

package Inheritance;

interface One{
    public void print_One();
}
interface Two{
    public void print_Two();
}
interface Three extends One, Two{
    public void print_One();
}
class Child implements Three{
    
    public void print_One(){
            System.out.println("One!");
    }

    
    public void print_Two() {
        System.out.println("Two!");
    }
}
class InterfaceTest{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.print_One();
        obj.print_Two();
        
    }
}
