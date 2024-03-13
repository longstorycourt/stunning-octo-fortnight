package interfaceStu;

public class Student {
    private int id;
    private String name;
    private String sex;
    public Student (int id, String name, String sex){
        this.setId(id);
        this.setName(name);
        this.setSex(sex);
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getSex(){return sex;}
    public void setId(int id){ this.id = id;}
    public void setName(String name){ this.name = name;}
    public void setSex(String sex){ this.sex = sex;}

    public String toString(){
        return id+ "\t"+ name + "\t"+sex+ "\t";
    }

}
