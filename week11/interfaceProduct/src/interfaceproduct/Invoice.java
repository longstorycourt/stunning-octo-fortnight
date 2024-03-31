package interfaceproduct;

import java.util.Scanner;

public class Invoice extends Product implements InputOutput{
    private int qty;
    private double total;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.print("Enter quantity: ");
        qty = sc.nextInt();
        total = getPrice()* qty;
    }
    public void output(){
        System.out.println(qty + "\t"+ total);
    }
}
