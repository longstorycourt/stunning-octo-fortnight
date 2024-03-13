package interfaceStu;

class Result implements Exam {
    Student student;
    Subject subject;
    public Result (Student student, Subject subject){
        this.student = student;
        this.subject = subject;
    }
    public void display(){
        System.out.println("Student: "+ student.toString());
        System.out.println("Subject: "+ subject.toString());
        System.out.println("Average: "+ average());
    }

    public double average(){
        return (subject.getJava()+ subject.getVb()+ subject.getNetwork())/3;
    }
    
}
