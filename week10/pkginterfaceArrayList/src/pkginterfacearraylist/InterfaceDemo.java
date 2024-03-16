package pkginterfacearraylist;

import java.util.ArrayList;

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
        
        ArrayList<NewYear> n = new ArrayList<>();
        n.add(new Khmer());
        n.add(new International());
        for (NewYear e : n)
            e.welcome();

        Khmer k1 = new Khmer();
        n.add(k1);
        International i1 = new International();
        n.add(i1);
        for(int j=0; j<n.size(); j++)
            n.get(j).welcome();
    }
}
