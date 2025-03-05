package factorial;
import java.util.Scanner;

public class Factorial {
	
	    public static void main(String[] args) {
	        // Create a scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Call the factorial function and print the result
	        long result = factorial(number);
	        System.out.println("Factorial of " + number + " is " + result);
	        
	        // Close the scanner object
	        scanner.close();
	    }

	    // Function to calculate factorial
	    public static long factorial(int n) {
	        long fact = 1;
	        
	        // Calculate factorial iteratively
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        
	        return fact;
	    }
	}


