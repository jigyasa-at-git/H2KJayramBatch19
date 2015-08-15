package operator;

public class RelationalExample {
	
	public static void main (String [] args){
		//String name = "Vani";
		String one = "67";
		
		int ageOne = Integer.parseInt(one); // int ageOne = 50;
		int ageTwo = Integer.parseInt(args[1]); // int ageTwo = 40;
		
		System.out.println(ageOne +" || "+ ageTwo);
		
		System.out.println("ageOne == ageTwo = " + (ageOne == ageTwo));
		System.out.println ("ageOne != ageTwo = "+(ageOne != ageTwo));
		System.out.println("ageOne > ageTwo = "+(ageOne > ageTwo));
		System.out.println ("ageOne >= ageTwo" +(ageOne >= ageTwo));
		System.out.println ("ageOne < ageTwo"+(ageOne < ageTwo));
		System.out.println("ageOne <= ageTwo"+(ageOne <= ageTwo));


		//System.out.println(name);
		//System.out.println(name.toUpperCase());
		
	}

}
