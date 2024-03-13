package pkginterface;
interface Deposit{
    void Interest(double principle, int year, double rate);
}
class Simple implements Deposit{
    public void Interest(double p, int n, double r){
        double intr, total;
        intr = p*n*r/100.00;
        total = p+intr;
        System.out.println("\nPrinciple amount = USD"+ p);
        System.out.println("Number of years = "+ n);
        System.out.println("Interest rate = "+ r + "%");
        System.out.println("Interest amount = USD"+ intr );
        System.out.println("Total amount after"+ n + "years in simple interest = USD"+ total);
    }
}
class Compound implements Deposit{
    public void Interest(double p, int n, double r){
        double intr, total;
        total = p*Math.pow(1+r/100.0, n);
        intr = total -p;
        System.out.println("\nPrinciple amount = USD"+ p);
        System.out.println("Number of years = "+ n);
        System.out.println("Interest rate = "+ r + "%");
        System.out.println("Interest amount = USD"+ intr );
        System.out.println("Total amount after"+ n + "years in compound interest = USD"+ total);
    }
}
public class InterfaceCal {
    public static void main(String[] args) {
        Simple sim = new Simple();
        Compound com = new Compound();
        sim.Interest(12500.0, 4, 12.5);
        com.Interest(12500.0, 4, 12.5);
    }
}
