package arrays;

public class ArrayTwoDimensionExample {

	public static void main(String[] args) {

		String names[] = {"Jay", "Jigs", "Raj"};
		String cars[] = {"Honda", "Beetle", "Audi"};		
		
		String jay[] = {"Jay","Honda"};
		String jigs[] = {"Jigs","Beetle"};
		String raj[] = {"Raj","Audi"};
		
		String humanDetails[][]={jay, jigs, raj};
		int twoD[][]= new int [2][3];
		
		//System.out.println("Trying to print HONDA : "+humanDetails[0][1]);
		
		
		
		for(int i=0; i <names.length; i++){
			
			//for (int j=0;j<cars.length;j++){
			int j = i;
			
			String carName = cars[j];
	
				System.out.println("Line "+i+" : "+names[i] + " || "+ carName);
				//j++;		

			//}
				

		}

		
	}

}
