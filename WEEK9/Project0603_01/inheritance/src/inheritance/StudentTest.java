package inheritance;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of students:");
        n = scan.nextInt();
        Semester2 sm2[] = new Semester2[n];
        for(int i=0; i<sm2.length; i++){
            sm2[i] = new Semester2();
            sm2[i].input();
        }
        System.out.println("SHOW RESULT AFTER INPUT: ");
        for(int i=0; i<sm2.length; i++)
            sm2[i].output();
            
        scan.close();
        
        
    }
}
