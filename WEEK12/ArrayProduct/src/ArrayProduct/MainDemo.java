package ArrayProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainDemo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList <Product> prod = new ArrayList<>();
        for (int i= 0; i<n; i++){
            Product pro = new Product();
            pro.input();
            prod.add(pro);
        }

        for (Product p : prod)
            p.output();
    
        //Product sort
        sort(prod);
        System.out.println("Products after sorted: ");
        for (Product p : prod)
            p.output();

        //Product Search
        search(prod);

        //Product Edit
        edit(prod);
        System.out.println("Products after edited: ");
        for (Product p : prod)
            p.output();

        //Product Deletion
        delete(prod);
        System.out.println("Products after deletion: ");
        for (Product p : prod)
            p.output();
    }
    
    public static void sort(ArrayList<Product> pro){ 
        Collections.sort(pro, (p1, p2) -> p1.name.compareToIgnoreCase(p2.name));  
    }
    public static void search(ArrayList<Product> pro){
        System.out.print("Enter product name to search: ");
        String sname = sc.next();
        for(int i = 0; i<pro.size(); i++){
            if (pro.get(i).name.equalsIgnoreCase(sname)){
                System.out.println("Product found: ");
                pro.get(i).output();
            }    
        }
    }
    public static void edit(ArrayList<Product> pro){
        System.out.print("Enter product name to edit: ");
        String sname = sc.next();
        for(int i = 0; i<pro.size(); i++){
            if (pro.get(i).name.equalsIgnoreCase(sname))
                pro.get(i).input();
        }
    }
    public static void delete(ArrayList<Product> pro){
        System.out.print("Enter product name to delete: ");
        String sname = sc.next();
        for(int i = 0; i<pro.size(); i++){
            if (pro.get(i).name.equalsIgnoreCase(sname))
                pro.remove(i);
        }
    }
}