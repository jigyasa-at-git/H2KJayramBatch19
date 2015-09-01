package assignments.a_01assignmentsCoreJava;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		/*
		 * Exercise 13: Write Java program to prompt the user to choose the
		 * correct answer from a list of answer choices of a question. The user
		 * can choose to continue answering the question or stop answering it.
		 * See the example below:
		 * 
		 * What is the command keyword to exit a loop in Java? a. int b.
		 * continue c. break d. exit Enter your choice: b
		 * 
		 * Incorrect!
		 * 
		 * Again? press y to continue:
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println("a. int");
		System.out.println("b. continue");
		System.out.println("c. break");
		System.out.println("d. exit");
		System.out.println("Enter your choice:");

		String ans = scan.next();

		do {
			System.out.println("Incorrect!");
			System.out.println("Again? press y to continue:");
			String yes = scan.next();

		} while (ans == "b");

	}

}
