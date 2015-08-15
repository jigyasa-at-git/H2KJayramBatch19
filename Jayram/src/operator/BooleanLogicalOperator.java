package operator;

public class BooleanLogicalOperator {

	public static void main(String[] args) {
/*		String one = "66";
		String two = "67";
		
		int ageOne = Integer.parseInt(one); // int ageOne = 50;
		int ageTwo = Integer.parseInt(two); // int ageTwo = 40;
		
		int heightOne = 6;
		int heightTwo = 5;
		
		//System.out.println(ageOne +" || "+ ageTwo);
		
		//System.out.println ((ageOne == ageTwo) & (heightOne == heightTwo));
		//System.out.println("ageOne == ageTwo is " + (heightOne == heightTwo));
		
		boolean isSameAge = (ageOne == ageTwo);
		boolean isSameHeight = (heightOne == heightTwo);
		
		System.out.println(isSameAge && isSameHeight);
		
		// OR
		
		boolean isSame = isSameAge & isSameHeight;
		System.out.println(isSame);
*/
		
		// DIfference between & and &&
		
		//================================ & Operator =================

		String one0 = "66";
		String two0 = "67";
		
		int ageOne0 = Integer.parseInt(one0); // int ageOne = 50;
		int ageTwo0 = Integer.parseInt(two0); // int ageTwo = 40;
		
		int heightOne0 = 6;
		int heightTwo0 = 5;
		System.out.println("==========   & Operator [And Operator] ========");
		System.out.println ((ageOne0 == ageTwo0) & (heightOne0 == heightTwo0++));
		System.out.println(heightTwo0);
		
		//================================ && Operator [Short Circuit And]  =================
		
		
		String one1 = "66";
		String two1 = "67";		
		
		int ageOne1 = Integer.parseInt(one1); // int ageOne = 50;
		int ageTwo1 = Integer.parseInt(two1); // int ageTwo = 40;
		
		int heightOne1 = 6;
		int heightTwo1 = 5;
		
		System.out.println("==========   && Operator [Short Circuit And] ========");
		System.out.println ((ageOne1 == ageTwo1) && (heightOne1 == heightTwo1++));
		System.out.println(heightTwo1);

		
		//================================   | Operator [OR] =================
		
		
		String one2 = "66";
		String two2 = "67";		
		
		int ageOne2 = Integer.parseInt(one2); // int ageOne = 50;
		int ageTwo2 = Integer.parseInt(two2); // int ageTwo = 40;
		
		int heightOne2 = 6;
		int heightTwo2 = 5;
		System.out.println("==========   || Operator  OR Operator] ========");
		System.out.println ((ageOne2 == ageTwo2) | (heightOne2 == heightTwo2++));
		System.out.println(heightTwo2);

		
		//================================   || Operator [Short Circuit OR] =================
		
		
		String one3 = "66";
		String two3 = "67";		
		
		int ageOne3 = Integer.parseInt(one3); // int ageOne = 50;
		int ageTwo3 = Integer.parseInt(two3); // int ageTwo = 40;
		
		int heightOne3 = 6;
		int heightTwo3 = 5;
		System.out.println("==========   || Operator [Short Circuit OR] ========");
		System.out.println ((ageOne3 == ageTwo3) || (heightOne3 == heightTwo3++));
		System.out.println(heightTwo3);

	}

}
