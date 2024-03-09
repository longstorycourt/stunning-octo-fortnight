package polymorphism;
//hierarchical inheritance
class Sup{
    void who(){
        System.out.println("Who() in Sup!");
    }
}
class Sub1 extends Sup{
    void who(){
        System.out.println("Who() in Sub1!");
    }
}

class Sub2 extends Sup{
    void who(){
        System.out.println("Who() in Sub2!");
    }
}
    

public class PolymorphismTest {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();
        Sup supRef;

        supRef = superOb; 
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();

        // Sup[] supRef = {superOb, subOb1, subOb2};
        // for(int i=0; i<supRef.length; i++)
        //     supRef[i].who();

    }
}