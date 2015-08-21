package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		/*Write a Java program that allows the user to choose the correct answer of a question.

			See the example below:
 			What is the correct way to declare a variable to store an integer value in Java?
 			a. int 1x=10;
 			b. int x=10;
 			c. float x=10.0f;
 			d. string x="10";
 			Enter your choice: c
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=\"10\";");
		System.out.println("Enter your choice:");

		String ans =scan.next();
		
/*		if(ans.equals("c")){
			System.out.println("Good Job!");
			ans = scan.next();
		}else if(ans.equals("a")){
			System.out.println("Try again!");
			ans = scan.next();
		}else if(ans.equals("b")){
			System.out.println("Try again!");
			ans = scan.next();
		}else{
			System.out.println("Try again!");
		}
*/		
		


		String answers[] = {"a","b","c","d"};
		
		for (String answ : answers){
			
		 switch(answ){
		 
		 case "a":{
			 System.out.println("Try again!" );
			 ans =scan.next();
		 		}	
			 break;
		 case "b":{
			 System.out.println("Try again!" );
			 ans =scan.next();
		 		}	
			 break;
		 case "c":
			 System.out.println("Good Job!" );
			 break;
		 case "d":{
			 System.out.println("Try again!" );
			 ans =scan.next();
		 		}	
			 break;
		 default:
			 break;
			 
		 }
			
		}
	
		

	}

}
