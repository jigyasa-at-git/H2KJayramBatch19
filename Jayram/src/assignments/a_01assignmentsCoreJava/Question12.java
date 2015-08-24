package assignments.coreJavaAssignments;

import org.omg.Messaging.SyncScopeHelper;

public class Question12 {

	public static void main(String[] args) {
		/*Exercise 12: Write a Java program by using three for loops to print the 
		 * following pattern:
 			1******
 			12*****
 			123****
 			1234***
 			12345**
 			123456*
 			1234567
		 */
		
		for(int i=1; i<=7;i++){

			for (int j=1;j<=i;j++){
				//int n=j-1;
				System.out.print(j);
			}
			for (int k=7;k>i;k--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
