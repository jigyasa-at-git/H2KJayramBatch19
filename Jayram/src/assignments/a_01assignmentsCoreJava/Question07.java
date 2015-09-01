package assignments.a_01assignmentsCoreJava;

import java.util.Scanner;

public class Question07 {
	
	/*Write a Java program that determines a student’s grade. 
	 * The program will read three types of scores(quiz, mid­term, and final scores) 
	 * and determine the grade based on the following rules:

		­if the average score >=90% =>grade=A
		­if the average score >= 70% and <90% => grade=B
		­if the average score>=50% and <70% =>grade=C
		­if the average score<50% =>grade=F 
		
		See the example output below:
		
		Quiz score: 80
		Mid­term score: 68
		Final score: 90
		Your grade is B.
	*/


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Quiz Score: ");
		float quiz = scan.nextFloat();
		
		System.out.println("Enter Mid­term score: ");
		float midTerm = scan.nextFloat();
		
		System.out.println("Enter Final score: ");
		float finalScore = scan.nextFloat();
		
		Assignment07 asn = new Assignment07();
		float a = asn.average(quiz, midTerm, finalScore);
		
		System.out.println("Quiz Score: "+quiz);
		System.out.println("Mid­term score: "+midTerm);
		System.out.println("Final score: "+finalScore);
		System.out.println("Average score: "+a);

		if(a>=(90)){
			System.out.println("Your average is: "+a+" and grade is A");			
		}else if((a>=(70)) && (a<(90))){
			System.out.println("Your average is: "+a+" and grade is B");			
		}else if((a>=(50)) && (a<(70))){
			System.out.println("Your average is: "+a+" and grade is C");			
		}else{
			System.out.println("Your average is: "+a+" and grade is F");			
		}

	}
	
	public float average(float q, float m, float f){
		
		float a = (q+m+f)/3;
		//float ap = a/100; 
		return a;
	}

}
