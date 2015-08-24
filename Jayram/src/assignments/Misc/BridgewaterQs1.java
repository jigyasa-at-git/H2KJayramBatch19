package assignments.Misc;

import java.util.HashMap;
import java.util.Map;

public class BridgewaterQs1 {

	public static void main(String[] args) {


		//Please go through these functions to understand its functionality. Also figure out the issues in them.
		
		BridgewaterQs1 bgw = new BridgewaterQs1();
		System.out.println(bgw.FunctionOne(10, 10));
		

	}
	
	//Example 1:

	int FunctionOne (int a, int b) {
	    for(int x = a; x >= 0; x--) {
	        if (a % x == 0 && b % x == 0) {
	            return x;
	        }
	    }
	    return 1;
	}
	
	
	

}
