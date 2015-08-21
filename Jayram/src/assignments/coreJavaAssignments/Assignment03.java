package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args){
		
		/*	
		 * Write Java program to allow the user to input two float values and 
		 * then the program adds the two values together. 
		 * The result will be assigned to the first variable
		*/	
			
				
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter 1st #");
			float n1 = scan.nextFloat();
			
			System.out.println("Enter 2nd #");
			float n2 = scan.nextFloat();
			
			add(n1,n2);
			
		}
		
		
		public static void add (float i, float j){
			
			float x = i+j;
			System.out.println(i + " + " + j + " = " + x);
			
		}

}
