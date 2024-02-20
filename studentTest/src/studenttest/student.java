package studenttest;
import javax.swing.JOptionPane;
public class student {
    private int id;
    private String name;
    private double avg;
    private char grade;

    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setAvg(double avg){this.avg = avg;}
    public void setGrade(char grade){this.grade = grade;}

    student(){
        this(001, "Piseth", 99.99, 'A');
    }
    student(int i, String n, double a, char g){
        setId(i);
        setName(n);
        setAvg(a);
        setGrade(g);
    }

    public void editData(student[] s){
        String sname = JOptionPane.showInputDialog("Enter a name to search: ");
        for(int i=0; i<s.length; i++){
            if(s[i].getName().compareToIgnoreCase(sname)==0){
                String newname = JOptionPane.showInputDialog("Enter new Name: ");
                s[i].setName(newname);
            }
        }
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public double getAvg(){return avg;}
    public char getGrade(){return grade;}

    public String getResult(){
        return getId()+""+"\t"+getName()+"\t"+getAvg()+"\t"+getGrade()+"\n";
    }

}
