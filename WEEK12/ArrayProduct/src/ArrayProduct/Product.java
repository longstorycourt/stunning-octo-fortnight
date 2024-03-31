package ArrayProduct;

import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);
    public int id;
    public String name;
    public double price;
    public int qty;
    public double total;
    
    public void input(){
        System.out.print("Enter product ID: ");
        id = sc.nextInt();
        System.out.print("Enter product name: ");
        name = sc.next();
        System.out.print("Enter product price: ");
        price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        qty = sc.nextInt();
        total = calcTotal();
    }
    public void output(){
        System.out.println(id +"\t"+ name +"\t"+ price+"\t"+ qty+"\t"+ total);
    }
    double calcTotal(){
        return price * qty;
    }
}
