package controlstatement;

public class Client {

	public static void main(String[] args) {

		Ring diamond = new Ring();
		diamond.color = "Transparent";
		diamond.metalType = "Stone";
		diamond.weight = 5;
		
		//System.out.println(diamond.color + " " + diamond.metalType + " " + diamond.weight);
		
		diamond.printDetails();

	}

}
