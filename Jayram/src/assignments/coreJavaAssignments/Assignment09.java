package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Assignment09 {

	public static void main(String[] args) {
		
	/*	
		Write a Java program to detect key presses. 
		If the user pressed number keys( from 0 to 9), 
		the program will tell the number that is pressed,  
		otherwise, program will show "Not allowed".
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hit a Key!");
		
		try{
			int key = scan.nextInt();
			System.out.println("You have hit #"+key+" key");
			
		}catch(Exception e){
			System.out.println("Not allowed");
		}
		
	}

}
