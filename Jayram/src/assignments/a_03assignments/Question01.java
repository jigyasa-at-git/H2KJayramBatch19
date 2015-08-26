package assignments.a_03assignments;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// 1) Create a class Tax which has instance variables invoke the calcTax() 
		// method which return the tax.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Income: ");
		float income = scan.nextFloat();
		System.out.println("Enter Tax Rate: ");
		float taxRate = scan.nextFloat();
		
		calcTax(income, taxRate);
		
		
	}

	private static void calcTax(float amt, float rate) {
		// TODO Auto-generated method stub
		
		float tax = (amt*rate)/100;
		System.out.println("Tax to be paid: "+tax);
		
	}
	
	

}
