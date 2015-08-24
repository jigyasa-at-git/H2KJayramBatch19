package assignments.coreJavaAssignments;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*Write a Java program to calculate the revenue from a sale based on the unit price 
		 * and quantity of a product input by the user. 
		 * The discount rate is 10% for the quantity purchased between 100 and 120 units, 
		 * and 15% for the quantity purchased greater than 120 units. 
		 * If the quantity purchased is less than 100 units, the discount rate is 0%. 
		 * See the example output as shown below: 

			Enter unit price: 25
			Enter quantity: 110
			The revenue from sale: 2475.0$
			After discount: 275.0$(10.0%)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter unit price: ");
		float price = scan.nextFloat();
		
		System.out.println("Enter Qty.: ");
		int qty = scan.nextInt();
		
		Assignment08 asn = new Assignment08();
		asn.disc(qty, price);
		
		float rev = qty*price;
		float aftDisc = asn.disc(qty, price);
		String per = asn.percent(qty);
		
		System.out.println("The revenue from sale: "+(rev-aftDisc));
		System.out.println("After discount: "+aftDisc+"$("+per+")");
		
	}
	
	public float disc(int q, float price){
		
		float cost = q*price;
		
		if (q<100){
			cost = cost;
		}else if((q<=120) && (q>=100)){
			cost = (cost*10)/100;
		}else{
			cost = (cost*15)/100;
		}
		return cost;
	}
	
	public String percent(int q){
		
		String per;
		
		if (q<100){
			per = "0.0%";
		}else if((q<=120) && (q>=100)){
			per = "10.0%";
		}else{
			per = "15.0%";
		}
		return per;
		
	}

}
