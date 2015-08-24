package assignments.a_02assignments;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * Swap Numbers Without Using Third Variable Java Example This Swap
		 * Numbers Java Example shows how to swap value of two numbers without
		 * using third variable using java.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter #1: ");
		int o = scan.nextInt();
		
		System.out.println("Enter #2: ");
		int t = scan.nextInt();
		
		// for eg: o=10 ... t=20
		
		o = o+t; // now o=30 ... t was 20
		t = o-t; // so now t = 30-20 = 10 which was o's value
		o = o-t; // o was 30 and now t is 10, so new o becomes 20 which was t's original value
		
		System.out.println("1st # is: "+o);
		System.out.println("2nd # is: "+t);

	}

}
