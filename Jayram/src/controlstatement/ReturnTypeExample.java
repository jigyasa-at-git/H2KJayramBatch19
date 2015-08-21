package controlstatement;

public class ReturnTypeExample {

	public static void main(String[] args) {

		ReturnTypeExample rte = new ReturnTypeExample(); 
		// we are creating an instance of the method and then calling a nonstatic class
		
		rte.printMe("Jigs", "Nfn", 16);
		
		String message = rte.getMessage("Jigs", "Nfn", 16) + "How are you?";
				System.out.println(message);
		
	}

	public void printMe(String firstName, String lastName, int age){
		
		System.out.println("Hello World ..."+firstName+ " "+lastName+" "+age);
	}
	
	public String getMessage(String firstName, String lastName, int age){
		
		//return "Hello World ..."+firstName+ " "+lastName+" "+age;
		// or
		
		String message = "Hello"+firstName+ " "+lastName+" "+age;
		return message;
	}	
	
}
