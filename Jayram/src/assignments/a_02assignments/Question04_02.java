package assignments.a_02assignments;

import java.util.Scanner;

public class Question04_02 {

	public static void main(String[] args) {
		/*
		 * Swap String Without Using Third Variable Java Example This Swap
		 * Numbers Java Example shows how to swap value of two numbers without
		 * using third variable using java.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String a = scan.next();
		
		System.out.println("Enter String 2: ");
		String b = scan.next();
		
		// for eg: o=10 ... t=20		
		//String a="one";
	    //String b="two";

	    a= a+b;
	    System.out.println("a is now: "+a); // a is now: onetwo
	    System.out.println("a.length(): "+a.length());// a.length(): 6
	    System.out.println("b.length(): "+b.length());// b.length(): 3
	    // so here, b is given the value of a by
	    // reducing new a's length 6 - b's length 3 at the index 0
	    b = a.substring(0,(a.length()-b.length())); 
	    // so here, a is given the value of b by
	    // starting at the index of b's length in new a's index
	    a = a.substring(b.length(),(a.length()));

	    System.out.println("a = "+a);
	    System.out.println("b = "+b); 

	}

}
