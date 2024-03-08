package inheritance;

import java.util.Scanner;

public class Semester1 {
    protected double sub1;
    protected double sub2;
    public Semester1(){
        this (0.0, 0.0);
    }
    public Semester1(double s1, double s2){
        sub1= s1;
        sub2 = s2;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter subject1 's score: ");
        sub1 = scan.nextDouble();
        System.out.print("Enter subject2 's score: ");
        sub2 = scan.nextDouble();
        scan.close();
    }
    public void output(){
        System.out.print("Semester1: ");
        System.out.print("Semester1: "+getSub1()+ "\tSemester2: "+getSub2());
    }
    public double total(){return sub1+sub2;}

    public void setSub1(double s1){sub1 =s1;}
    public void setSub2(double s2){sub2= s2;}
    public double getSub1(){return sub1;}
    public double getSub2(){return sub2;}
    
}
