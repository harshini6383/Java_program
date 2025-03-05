package studentmarklist;

public class Student {
	
	    String name;
	    int rollNo;
	    int m1, m2, m3;

	    // Constructor to assign values
	    public Student(String name, int rollNo, int m1, int m2, int m3) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.m1 = m1;
	        this.m2 = m2;
	        this.m3 = m3;
	    }

	    // Method to calculate total marks
	    public int calculateTotal() {
	        return m1 + m2 + m3;
	    }

	    // Method to calculate average marks
	    public double calculateAverage() {
	        return calculateTotal() / 3.0;
	    }

	    // Method to display student details
	    public void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Total Marks: " + calculateTotal());
	        System.out.println("Average Marks: " + calculateAverage());
	        System.out.println("-----------------------------");
	    }
	}


