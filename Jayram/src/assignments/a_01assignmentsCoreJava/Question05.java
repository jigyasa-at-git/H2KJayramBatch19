package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*Write Java program to allow the user to  input his/her age. 
		 * Then the program will show if the person is eligible  to vote.
		 * A person who is eligible to vote must be older than or equal to  18 years old.
		 * Enter your age: 18
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age: ");
		float age = scan.nextFloat();
		
		if(age >= 18){
			
		System.out.println("Congartulation! You are eligible to vote.");
		}else{
			System.out.println("Sorry! You still have some time before you can vote.");
		}

	}
	
}
