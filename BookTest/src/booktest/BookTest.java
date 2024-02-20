//console + method in one file; no class
package booktest;
import java.util.Scanner;

public class BookTest {    
    int id;
    String title;
    String author;
    double price;
    Scanner sc = new Scanner(System.in);
    void inputData(){
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Title: ");
        title = sc.next();
        System.out.print("Enter Author: ");
        author = sc.next();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }
    static void sortData(BookTest[] t){
        BookTest temp;
        for(int i=0; i<t.length-1; i++){
            for(int j= i+1; j<t.length; j++){
                if(t[i].id>t[j].id){
                    temp = t[i];
                    t[i]= t[j];
                    t[j]=temp; 
                }
            }
        }
    }
    static void searchData(BookTest[]t, String sname){
        for(int i =0 ; i<t.length; i++)
            if(t[i].title.compareToIgnoreCase(sname)==0){
                t[i].outputData();
            }
    }
    static void editbyName(BookTest[] t , String sname){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<t.length; i++)
        if(t[i].title.compareToIgnoreCase(sname)==0){
            System.out.print("Enter new price: ");
            t[i].price = sc.nextDouble();
        }
    }
    static void header(){
        System.out.println("ID\tName\tAuthor\tPrice");
    }
    void outputData(){
        System.out.println(id+"\t"+title+"\t"+author+"\t"+price);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        BookTest[] book = new BookTest[n];
        for(int i=0; i<n; i++){
            book[i] =new BookTest();
            book[i].inputData();
        }
        header();
        for(BookTest b: book)
            b.outputData();
        // System.out.print("Enter a name to search: ");
        // String sname = sc.next();
        // searchData(book, sname);
        System.out.print("Enter a name to search: ");
        String sname = sc.next();
        editbyName(book,sname);
        //sortData(book);
        header();
        for(BookTest b: book)
            b.outputData();
        sc.close();
    }
}
