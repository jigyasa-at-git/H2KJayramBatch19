package controlstatement;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your input: ");
		String name = scan.next();
		
		System.out.println(name);

		
		do {
			
			name = scan.next();
			System.out.println(name);
			System.exit(0);

		}
		while(name != "Quit");
		
		//String output = (input >= 18) ? "He is an Adult" : "He is not an Adult"; // ternary operator


	}

}
