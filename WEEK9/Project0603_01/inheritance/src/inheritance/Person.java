package inheritance;

public class Person {
    private String sn;
    private String name;
    public Person(){
        this("a001", "Phil Dunphy");
    }
    public Person(String s, String n){
        setSn(s); setName(n);
    }
    public void setName(String n) {
        name =n;
    }
    public void setSn(String s) {
        sn = s;
    }
    public String getSn(){return sn;}
    public String getName(){return name;}
    public String toString(){return getSn()+" "+getName();}
    
    
}
