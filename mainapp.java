package studentmarklist;
import java.util.Scanner;
public class mainapp {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, rollNo, m1, m2, m3);
        
        System.out.println("\nStudent Mark List");
        
        System.out.println("--------------------------");
        
        s.displayDetails();
        sc.close(
        		);
    }
    
}