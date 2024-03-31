package interfaceproduct;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InputOutput> list = new ArrayList<>();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            Product pro = new Product();
            pro.input();
            list.add(pro);
            Invoice inv = new Invoice();
            inv.input();
            list.add(inv);
        }
    }
    public static void sort(){

    }
    public static void search(){
        
    }
    public static void edit(){
        
    }
    public static void delete(){
        
    }
}
