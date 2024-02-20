
package studenttest;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentTest {    
    String inputString(String str){
        return JOptionPane.showInputDialog(str);
    }
    student inputData(){
        int i = Integer.parseInt(inputString("Enter id:"));
        String n = inputString("Enter name: ");
        double a = Double.parseDouble(inputString("Enter avg:"));
        char g = inputString("Enter grade:").charAt(0);
        return new student(i, n, a,g);
    }
    void outputData(String m){
        JTextArea Text = new JTextArea(m,10,40);
        Text.setForeground(Color.CYAN);
        Text.setBackground(Color.black);
        Text.setFont(new Font("Calibri", Font.PLAIN, 18));
        Text.setEditable(false);
        JOptionPane.showMessageDialog(null,Text, "Students", JOptionPane.PLAIN_MESSAGE);
    }
    StudentTest(){
        int n = Integer.parseInt(inputString("Enter the number of students: "));
        student[] stu= new student[n];
        String result = "ID\tNAME\tAVG\tGRADE\n";
        for(int i = 0; i<n; i++){
            stu[i]= new student();
            stu[i]=inputData();
            result+=stu[i].getResult();
        }
        outputData(result);
        student st = new student();
        st.editData(stu);
        result = "ID\tNAME\tAVG\tGRADE\n";
        for(int i = 0; i<n; i++){
            result+=stu[i].getResult();
        }
        outputData(result);
    }
    public static void main(String[] args) {
        new StudentTest();
    }
}
