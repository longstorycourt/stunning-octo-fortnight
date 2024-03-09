package polymorphism;

import java.text.DecimalFormat;

abstract class Deposit{
    double principal;
    int year;
    abstract double Interest(int p, double rate, int yr);
}

class Simple extends Deposit{
    double Interest(int p, double rate, int year){
        principal = p;
        this.year = year;
        double total = p*(1+year+rate/100);
        return total;
    }
}
class Compound extends Deposit{
    double Interest(int p, double rate, int year){
        principal = p;
        this.year = year;
        double total = p*Math.pow((1+year+rate/100), year);
        return total;
    }
}

public class BankDemo {
    static DecimalFormat Df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Deposit d1 = new Simple();
        Deposit d2 = new Compound();

        // Simple d1 = new Simple();
        // Compound d2 = new Compound();

        double Sim = d1.Interest(25000, 9.25, 5);
        double com = d2.Interest(25000, 8.5,5);

        Sim = (int)(Sim*100);
        com = (int)(com*100);
        Sim = Sim/100;
        com = com/100;

        System.out.println("Total after "+d1.year+" years for USD"+Df.format(d1.principal)+" in simple interest is USD"+Df.format(Sim));
        System.out.println("Total after "+d2.year+" years for USD"+Df.format(d2.principal)+" in compound interest is USD"+Df.format(com));
    }
}
