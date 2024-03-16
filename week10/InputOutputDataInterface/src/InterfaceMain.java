import java.util.ArrayList;
import java.util.Scanner;

interface InputOutputData {
    Scanner scan = new Scanner(System.in);
    void inputData();
    void outputData();
}
class student implements InputOutputData {
    int id;
    String name;
    int age;
    public void inputData(){
        System.out.print("Enter id: ");
        id = scan.nextInt();
        System.out.print("Enter name: ");
        name = scan.next();
        System.out.print("Enter age: ");
        age = scan.nextInt();
    }
    public void outputData(){
        System.out.print(id +"" + "\t"+ name+ "\t" + age+ "\t");
    }
}
class DOB implements InputOutputData{
    int d, m, y;
    public void inputData(){
        System.out.print("Enter day: ");
        d = scan.nextInt();
        System.out.print("Enter month: ");
        m = scan.nextInt();
        System.out.print("Enter year: ");
        y = scan.nextInt();
    }
    public void outputData(){
        System.out.println(d + ""+"\t"+m+"\t"+ y);
    }
}

public class InterfaceMain {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int n = scan.nextInt();
        ArrayList<InputOutputData> list = new ArrayList<>();

        for(int i= 0; i<n;i++){
            list.add(new student());
            list.add(new DOB());
        }
        for(int i = 0; i<list.size(); i++){
            list.get(i).inputData();
        }
        for(int i= 0; i<list.size();i++)
            list.get(i).outputData();
        scan.close();
    }
}
