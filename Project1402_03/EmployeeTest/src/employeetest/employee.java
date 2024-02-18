package employeetest;

import javax.swing.JOptionPane;

public class employee {
    private int id;
    private String name;
    private int hour;
    private double rate;
    private double salary;
    
    public void setId(int id){this.id = id;} 
    public void setName(String name){this.name = name;}
    public void setHour(int hour){this.hour= hour;}
    public void setRate(double rate){this.rate= rate;}
    public void setSalary(double salary){this.salary= salary;}

    employee(){
        this(001, "Dara Kim", 45, 8.5, 45*8.5);
    }
    employee(int i, String n, int h, double r, double s){
        setId(i);setName(n);setHour(h);setRate(r);setSalary(s);
    }
    
    public int getId(){return id;}
    public String getName(){return name;}
    public int getHour(){return hour;}
    public double getRate(){return rate;}
    public double getSalary(){return salary;}
    
    public void editName(employee[] em){
        String sname = JOptionPane.showInputDialog("Enter a name to search");
        for(int i=0; i<em.length; i++){
            if(em[i].getName().compareToIgnoreCase(sname)==0){
                String newName = JOptionPane.showInputDialog("Enter a name to replace:");
                em[i].setName(newName);
            }
        }
    }
    String getResult(){
        return getId()+""+"\t"+getName()+"\t"+getHour()+"\t"+getRate()+"\t"+getSalary()+"\n";
    }
}
