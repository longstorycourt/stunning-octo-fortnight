package inheritance;
class EmployeeExtenperson extends Person{
    private int id;
    private double salary;
    public EmployeeExtenperson(){
        super();
        id =1001;
        salary = 1050;
    }
    public EmployeeExtenperson(String s, String n, int i, double sa){
        super(s,n);
        setId(i);
        setSalary(sa);
    }
    public void setId(int i){ id=i;}
    public void setSalary(double s){salary =s;}
    public int getId(){return id;}
    public double getSalary(){return salary;}
    public String toString (){
        return super.toString()+" "+getId()+" "+getSalary()+"\n";
    }
}
public class EmployeeTest{
    public static void main(String[] args) {
        EmployeeExtenperson e = new EmployeeExtenperson();
        System.out.print(e.toString());
        e.setSn("b002");
        e.setSalary(1234.50);
        System.out.print(e.toString());
    }
}

