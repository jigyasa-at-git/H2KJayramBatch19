package arrays;

public class ArrayOneDimensionExample {

	public static void main(String[] args) {

		String twelve = "12";
		int age1 = Integer.parseInt(twelve);
		int age2 = 13;
				
		int ages[] = {age1, age2, 14, Integer.parseInt("15")};	// initializing Array without declaring size
		System.out.println("ages.length outside for loop = "+ages.length);

		for(int i =0 ; i <ages.length; i++){
			
			//System.out.println("ages.length inside for loop = "+ages.length);
			System.out.println(ages[i]);
			
		}
		
		
/*		int heights [] = new int[5]; /// creating array with size first
		System.out.println("ages[1] : "+ages[1]);
		System.out.println("ages.length = "+ages.length);
		System.out.println("Entire array : "+ages);
		
		
		
		heights[0] = 6;
		heights[1]=Integer.parseInt("8");
		heights[2]=Integer.parseInt(twelve);
		System.out.println("heights[2] : "+heights[2]);
		System.out.println("heights.length = "+heights.length);
		System.out.println("Entire array height : "+heights);
		
*/		
		
		// Enhanced Loop
		
		String[] appleBag = {"Apple01", "Apple02", "Apple03"};
		for (String apple : appleBag){
			
			if (!("Apple02" == apple)){   // we are negating Apple02 in if statement 
				
				System.out.println("Apple Name: "+apple);
			}
		}
		
		// To run loop infinetly
		// Ex 01:
		int idx = 0;
		
		for (;;){
			
			System.out.println(idx);
		}
		
/*		// Ex 02:
		
		while (true){
			
			System.out.println("Value is" + idx++);
		}
*/		

	}

}
