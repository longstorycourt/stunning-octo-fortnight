
package employeetest;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EmployeeTest {   
    String inputString(String s){
        return JOptionPane.showInputDialog(s);
    }
    employee inputData(){
        int i = Integer.parseInt(inputString("Enter ID: "));
        String n = inputString("Enter name: ");
        int h = Integer.parseInt(inputString("Enter hour: "));
        double r = Double.parseDouble(inputString("Enter rate: "));
        double s = findSalary(h,r);
        return new employee(i, n, h, r, s);
    }
    void outputData(String m){
        JTextArea Text = new JTextArea(m, 10, 40);
        Text.setBackground(Color.BLACK);
        Text.setForeground(Color.CYAN);
        Text.setFont(new Font("Calibri", Font.BOLD, 18) );
        Text.setEditable(false);
        JOptionPane.showMessageDialog(null,Text, "Employee", JOptionPane.PLAIN_MESSAGE);
    }
    private double findSalary(int hour, double rate) {
        return hour*rate;
    }
    EmployeeTest(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of employee: "));
        employee[] em = new employee[n];
        for(int i=0; i<n; i++){
            em[i] = new employee();
            em[i] = inputData();
        }
        String result = "ID\tNAME\tHOUR\tRATE\tSALARY\n";
        for(employee m : em){
            result+= m.getResult();
        }
        outputData(result);
        employee e = new employee();
        e.editName(em);
        //edit Name
        result = "\n";
        for(employee m : em){
            result+= m.getResult();
        }
        outputData(result);
    }

    public static void main(String[] args) {
        new EmployeeTest();
    }
}
