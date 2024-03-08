package inheritance;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String sex;

    public Student(){
        this(0, "Unknown", "None");
    }
    public Student(int i, String n, String s){
        id=i; name=n; sex= s;
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = scan.nextInt();
        System.out.print("Enter name: ");
        scan.nextLine();
        name = scan.nextLine();
        System.out.print("Enter sex: ");
        sex = scan.nextLine();
        scan.close();
    }
    public void Output(){
        System.out.println("Name: " +getName());
        System.out.println("ID: "+ getId());
        System.out.println("Sex: "+getSex());
    }
    public void setId(int i){id=i;}
    public void setName(String n){name=n;}
    public void setSex(String s){sex=s;}
    public int getId(){return id;}
    public String getName(){return name;}
    public String getSex(){return sex;}
}
