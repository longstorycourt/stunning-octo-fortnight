package interfaceproduct;

import java.util.Scanner;

public class Product implements InputOutput{
    private int proId;
    private String proName;
    private double price;
    Scanner sc = new Scanner(System.in);
    public double getPrice(){return price;}
    public void input() {
        System.out.print("Enter product id: ");
        proId = sc.nextInt();
        System.out.print("Enter product name: ");
        proName = sc.next();
        System.out.print("Enter product price: ");
        price = sc.nextDouble();
    }
    public void output(){
        System.out.print(proId + "\t"+ proName+ "\t"+ price+"\t");
    }
}
