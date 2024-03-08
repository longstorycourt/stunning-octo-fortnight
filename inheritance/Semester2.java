package inheritance;

import java.util.Scanner;

public class Semester2 extends Semester1 {
    private double sub3;
    private double sub4;
    private double sub5;
    private Student st;

    public Semester2(){
        super();
        sub3=0.0;
        sub4=0.0;
        sub5=0.0;
        st=null;
    }
    public Semester2(double s1, double s2, double s3, double s4, double s5, Student s){
        super(s1, s2);
        sub3 =s3; 
        sub4 = s4;
        sub5 = s5;
        st = s;
    }

    public void setSub3 (double s3){sub3= s3;}
    public void setSub4 (double s4){sub4= s4;}
    public void setSub5 (double s5){sub5= s5;}
    public double getSub3(){return sub3;}
    public double getSub4(){return sub4;}
    public double getSub5(){return sub5;}

    public void input(){
        Scanner scan = new Scanner(System.in);
        st = new Student();
        st.Input();
        super.input();
        System.out.print("Enter Subject3's score: ");
        sub3= scan.nextDouble();
        System.out.print("Enter Subject4's score: ");
        sub4= scan.nextDouble();
        System.out.print("Enter Subject5's score: ");
        sub5= scan.nextDouble();
        scan.close();
    }
    public void output(){
        st.Output();
        super.output();
        System.out.println("Total: "+super.total()+" and average = " + super.total()/2);
        System.out.println("Semester2: subject3: "+ getSub3()+"; subject4:"+getSub4()+"; subject5: "+getSub5());
        System.out.println("Total: "+total()+" and average: "+total()/3);
        System.out.println("The total average is "+ totalAvg());
    }
    public double total(){
        return (getSub3()+getSub4()+getSub5());
    }
    public double totalAvg(){
        return (super.total()/2+total()/3);
    }
    
}
