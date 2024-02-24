
package studenttest;

import javax.swing.JOptionPane;

class StudentInfo{
    private String id;
    private String name;
    private char sex;
    private float avg;
}
public class StudentTest {    
    public static void main(String[] args) {
        
    }
    static void deleteByName(StudentInfo[] st){
        String dname;
        dname = JOptionPane.showInputDialog("Enter name for delete: ");
        for(int i =0; i<st.length ; i++){
            if(st[i].      )
                for(int j=i; j<st.length; j++)
                    st[j]=st[j+1];
        }
    }
}
