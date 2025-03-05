package fibonacc;
import java.util.Scanner;

public class Fibonacci {
	

	
	    public static void main(String[] args) {
	        // Create a Scanner object to get user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ask user for the number of terms in the Fibonacci series
	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();

	        // Close the scanner as we don't need it anymore
	        scanner.close();

	        // First two terms of the Fibonacci series
	        int firstTerm = 0, secondTerm = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");

	        // Loop to generate the Fibonacci series
	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + " ");
	            
	            // Compute the next term in the series
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	    }
	}



