package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Assignment04 {

	public static void main(String args[]) {

		/*
		 * Write Java program to allow the user to input the amount of deposit,
		 * yearly interest rate (percentage), and income tax (percentage). Then
		 * the program will calculate the amount of interest that the person
		 * earns in the year. See the example output below:
		 * 
		 * The amount of deposit: 1000 
		 * Yearly interest rate: 7.5% 
		 * Income tax rate: 4% 
		 * The amount of interest earned in the year:71.0
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Amount of Deposit: ");
		float deposit = scan.nextFloat();

		System.out.println("Yearly Interest rate(%): ");
		float interest = scan.nextFloat();

		System.out.println("Income tax(%): ");
		float tax = scan.nextFloat();
		
		System.out.println("The amount of deposit: "+deposit);
		System.out.println("Yearly interest rate: "+interest+"%");
		System.out.println("Income tax rate: "+tax+"%");

		interestEarned(deposit, interest, tax);
		
		

	}

	public static void interestEarned(float d, float r, float t) {
		
		float grossInterestEarned = d*(r/100);
		float taxPaid = grossInterestEarned*(t/100);
		float netInterestEarned = grossInterestEarned - taxPaid;
		
		System.out.println("The amount of interest earned in the year: "+netInterestEarned);

	}

}
