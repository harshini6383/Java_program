package palindrome;
import java.util.Scanner;

public class palindrome {
	
	    public static void main(String[] args) {
	        // Create a scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter a string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Check if the string is a palindrome
	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }

	        // Close the scanner object
	        scanner.close();
	    }

	    // Function to check if the string is a palindrome
	    public static boolean isPalindrome(String str) {
	        // Convert the string to lower case to handle case-insensitive comparison
	        str = str.toLowerCase();

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;  // Not a palindrome
	            }
	            left++;
	            right--;
	        }

	        return true;  // It's a palindrome
	    }
	}



