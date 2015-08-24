package assignments.a_02assignments;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * Swap Numbers eg :
		 * num1 = 45; num2 = 60;
		 * when i print num1 and num2 , it should give as 60 and 45 .
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter #1: ");
		int one = scan.nextInt();
		
		System.out.println("Enter #2: ");
		int two = scan.nextInt();

		int temp;
		
		temp = one;
		one = two;
		two = temp;
		
		System.out.println("Swapped #1: "+one);
		System.out.println("Swapped #2: "+two);
		
	}

}
