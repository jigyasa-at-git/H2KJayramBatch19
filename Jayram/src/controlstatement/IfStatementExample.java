package controlstatement;

public class IfStatementExample {
	

	public static void main(String[] args) {

		int input, standard;
		String output, occupation;
		
		//int input = Integer.parseInt(args[0]);
		
/*		int input = 18;
		
		String output = (input >= 18) ? "He is an Adult" : "He is not an Adult"; // ternary operator
		System.out.println(output);

		System.out.println("He is an Adult");
		System.out.println("He is not an Adult");
		
		int standard = input-5;
		System.out.println("Standard is: "+ standard);
*/		
		input = 18;
		occupation = "Student";
		
		if(input>=18){
			
			output = "He is an Adult";
			standard = input - 5;
		} else {
			
			output = "He is not an Adult";
		}
		
		if(input>=18 && "Teacher".equals(occupation)){
			
			output+= "\n" + "He/ She is teacher as well";
		}
		
		
		if(input>=18 && "Teacher".equals(occupation)){
			
			output+= "\n" + "He/ She is teacher as well";
		} else if(input>=18 && "Student" == occupation){
			
			output+= "\n" + "He/ She is student";
		} else {
			
			output+= "\n" + "Enough if loops ... I am tired";
		}
		
		
				
		System.out.println(output);
	}

}
