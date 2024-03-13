package interfaceStu;


public class InterfaceMain {
    public static void main(String[] args) {
        Student student= new Student(1, "Soksan", "Male");
        Subject subject = new Subject(97,89,87);
        Result result = new Result(student, subject);
        result.display();
    } 
}
