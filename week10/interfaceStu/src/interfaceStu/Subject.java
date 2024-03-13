package interfaceStu;

public class Subject {
    private double java;
    private double vb;
    private double network;

    public Subject (double java, double vb, double network){
        this.setJava(java);
        this.setVb(vb);
        this.setNetwork(network);
    }

    public void setJava(double java){this.java = java;}
    public void setVb(double vb){this.vb = vb;}
    public void setNetwork(double network){this.network = network;}
    public double getJava(){return java;}
    public double getVb(){return vb;}
    public double getNetwork(){return network;}

    public String toString(){
        return java + "\t"+ vb +"\t"+ network;
    }
}
