package controlstatement;

public class DoWhile {

	public static void main(String[] args) {
		
		int i =5;

		do {
			System.out.println("This is for Do-While Loop: "+i--);
			
		} while (i > 0);
		
		// same can be done with
		
		int w = 0;
		while (w < 5){
			
			System.out.println("This is for While Loop: "+w++);
		}

		
	}

}
