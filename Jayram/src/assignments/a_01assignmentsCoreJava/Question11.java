package assignments.coreJavaAssignments;

public class Question11 {

	public static void main(String[] args) {
		/*Exercise 11: Write a Java program by using two for loops to produce the 
		 * output shown below:
		 	*******
		 	******
		 	*****
		 	****
		 	***
		 	**
		 	* 
		*/
		
		/*for (int i=1;i<=7;i++){
			if(i==1)
				System.out.println("********");
			else if(i==2)
				System.out.println("******");
			else if(i==3)
				System.out.println("*****");
			else if(i==4)
				System.out.println("****");
			else if(i==5)
				System.out.println("***");
			else if(i==6)
				System.out.println("**");
			else if(i==7)
				System.out.println("*");
		}*/
		for (int i = 7; i >= 1; i--) {
			 for (int j = i; j >= 1; j--) {
			 System.out.print("*");
			 }
			 System.out.println();
			}
		
	}

}
