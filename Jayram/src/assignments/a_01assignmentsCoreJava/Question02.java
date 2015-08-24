package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Question02 {
	
	public static void main(String[] args){
		
	/*	
	 * Exercise 2: Write Java Program to allow the user to input two integer values and 
	 * then the program prints the results of adding, subtracting, multiplying, and 
	 * dividing among the two values.
	*/	
		
			
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 1st #");
		int n1 = scan.nextInt();
		
		System.out.println("Enter 2nd #");
		int n2 = scan.nextInt();
		
		System.out.println("n1 = "+n1 + " || "+"n2 = "+n2);
		
		Question02 add = new Question02();
		add.add(n1,n2);
		
		Question02 subtract = new Question02();
		subtract.sub(n1, n2);
		
		multi(n1, n2);
		
		Question02.div(n1, n2);
		
	}
	
	
	public int add (int i, int j){
			
		int sum = i+j;
		System.out.println(+i + " + "+j+" = "+sum);
		return sum;
		
	}
	
	public void sub (int i, int j){
		
		int x = i-j;
		System.out.println(i + " - " + j + " = " + x);
		
	}
	
	public static void div (int i, int j){
		
		int x = i/j;
		System.out.println(i + " / " + j + " = " + x);
		
	}
	
	public static void multi (int i, int j){
		
		int x = i*j;
		System.out.println(i + " * " + j + " = " + x);
		
	}

}
