package assignments.a_02assignments;

public class Question02 {

	static int i, f, l;
	static String toReverse;
	static char chToReverse, chToReverseWith;
	
	public static void main(String[] args) {
		/*
		 * Reverse a string . Eg : input : computer output should be : retupmoc
		 */
		toReverse = "computer";

		i = toReverse.length();

		char chFirst = toReverse.charAt(0);
		char chLast = toReverse.charAt(i - 1);

		System.out.println("Length of String: " + i);
		System.out.println("First Char to reverse: " + chFirst);
		System.out.println("Last Char to reverse: " + chLast);

		// System.out.println("ChToReverse: " + chToReverse);
		// System.out.println("ChToReverseWith: " + chToReverseWith);

					for (int f = 0; f < i; f++) {
				chToReverse = toReverse.charAt(f);
				System.out.println("ChToReverse: " + chToReverse);
			}

			for (int l = i - 1; l >= f; l--) {
				chToReverseWith = toReverse.charAt(l);
				System.out.println("ChToReverseWith: " + chToReverseWith);
			}

			// Trying to switch now ... arrrrggghhhhh
			
		 String result="";
		 
		    for (int r=i-1; r>=0; r--) {
		        result = result + toReverse.charAt(r);
		    }
		    System.out.println(result);

	}
}
