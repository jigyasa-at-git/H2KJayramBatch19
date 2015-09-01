package assignments.a_01assignmentsCoreJava;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to determine  whether an input number is an even number
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a WHOLE Number: ");
		int num = scan.nextInt();
		
		if(num%2 == 0){
			System.out.println(num +" is an Even Number.");
		}else{
			System.out.println(num +" is not an Even Number.");
		}
		
		
	}

}
