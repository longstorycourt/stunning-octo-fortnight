import java.util.ArrayList;
import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    double avg;
    public void input(){
        System.out.print("Enter id: "); id = sc.nextInt();
        System.out.print("Enter name: "); name = sc.next();
        System.out.print("Enter avg: "); avg = sc.nextDouble();
    }
    public void output(){
        System.out.print(id+ "\t"+ name+ "\t"+ avg);
    }
    
    public void grade(){
        char g=' ';
        if(avg>50)
            if(avg>65)
                if(avg>75)
                    if(avg>85)
                        if(avg>95)
                            g=  'A';
                    else 
                    g=  'B';
                else
                g= 'C';
            else
            g= 'D';
        else   
        g= 'E';
        System.out.println("\t"+ g);
    }
}
public class StudentTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> list = new ArrayList<>();
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++)
            list.add(new Student());
        for(int i = 0; i<list.size(); i++)
            list.get(i).input();
        for(Student s: list){
            s.output();
            s.grade();
        }
        sc.close();
    }
}
