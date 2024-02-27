
import javax.swing.JOptionPane;

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
    void outputData(){
        System.out.println(id + ""+ "\t"+name+"\t"+sex+"\t"+avg);
    }
    public String getName(){return name;}

}
public class StudentTest {    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter n:"));
        StudentInfo[] stu = new StudentInfo[n];
        for(int i=0; i<n; i++){
            stu[i] = new StudentInfo();
            stu[i].inputData();
        }
        for(int i=0; i<n; i++)
            stu[i].outputData();
        deleteByName(stu);
        for(int i=0; i<n-1; i++)
            stu[i].outputData();
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
