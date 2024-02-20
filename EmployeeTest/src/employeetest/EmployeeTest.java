
package employeetest;
import java.util.Scanner;
import javax.swing.JOptionPane;
class employee{
    int id;
    String name;
    double rate;
    int hour;
    double salary;
    Scanner sc = new Scanner(System.in);
    String readString(String str){
        return JOptionPane.showInputDialog(str);
    }
    void inputData(){
        id= Integer.parseInt(readString("Enter id: "));
        name = readString("Enter name: ");
        rate = Double.parseDouble(readString("Enter rate:"));
        hour =Integer.parseInt(readString("Enter hour: "));
        salary = salary();
    }
    void outputData(){
        System.out.println(id+"\t"+name+"\t"+rate+"\t"+hour+"\t"+salary);    }
    double salary(){return rate *hour;}
}

public class EmployeeTest {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter n:"));
        employee[] emp= new employee[n];
        for(int i= 0; i<n; i++){
            emp[i] = new employee();
            emp[i].inputData();
        }
        for(int i=0; i<n; i++)
            emp[i].outputData();
    }
}
