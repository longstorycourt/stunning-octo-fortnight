package studenttest;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class StudentInfo{
    private String id;
    private String name;
    private char sex;
    private float avg;

    String inputString(String msg){
        return JOptionPane.showInputDialog(msg);
    }

    void inputData(){
        id = inputString("Enter id:");
        name = inputString("Enter name:");
        sex = inputString("Enter sex:").charAt(0);
        avg = Float.parseFloat(inputString("Enter avg:"));
    }
    static void outputData(String m){
        JTextArea text = new JTextArea(m, 10, 40);
        text.setBackground(Color.black);
        text.setForeground(Color.CYAN);
        text.setFont(new Font("Times New Roman", Font.BOLD, 18));
        text.setEditable(false);
        JOptionPane.showMessageDialog(null, text, "Students", JOptionPane.PLAIN_MESSAGE);
    }
    String getResult(){
        return id + ""+ "\t"+name+"\t"+sex+"\t"+avg+"\n";
    }
    public String getName(){return name;}

}
public class StudentTest {    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter n:"));
        StudentInfo[] stu = new StudentInfo[n];
        String result="ID\tNAME\tSEX\tAVG\n";
        for(int i=0; i<n; i++){
            stu[i] = new StudentInfo();
            stu[i].inputData();
            result+=stu[i].getResult();
        }
        StudentInfo.outputData(result);
        deleteByName(stu);
        result="ID\tNAME\tSEX\tAVG\n";
        n--;
        for(int i=0; i<n; i++)
            result+=stu[i].getResult();
        StudentInfo.outputData(result);
    }
    static void deleteByName(StudentInfo[] st){
        String dname;
        dname = JOptionPane.showInputDialog("Enter name for delete: ");
        for(int i=0; i<st.length ; i++){
            if(st[i].getName().compareToIgnoreCase(dname)==0){
                for(int j=i; j<st.length-1; j++)
                    st[j]=st[j+1];
            }
        }
    }
}
