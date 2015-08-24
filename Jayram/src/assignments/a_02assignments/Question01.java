package assignments.a_02assignments;

import java.util.ArrayList;

public class Question01 {
	
	static ArrayList<Integer> arraylist;
	
	public static void main(String[] args) {
		/*
		 * Find Largest and Smallest Number in an Array Example This Java
		 * Example shows how to find largest and smallest number in an array.
		 */

		arraylist = new ArrayList<Integer>();

		arraylist.add(5);
		arraylist.add(6);
		arraylist.add(8);
		arraylist.add(9);
		arraylist.add(2);
		arraylist.add(4);
		arraylist.add(9);

		Question01 largestnum = new Question01();
		largestnum.largest();
		
		Question01 smallestnum = new Question01();
		smallestnum.smallest();
	}
	
	public void largest(){
		
		int largest = arraylist.get(0);

		for (int l = 0; l < arraylist.size(); l++) {
			if (arraylist.get(l) > largest)
				largest = arraylist.get(l);
		}
		System.out.println("Largest # in the ArrayList is: "+largest);
		//return(largest);
	}
	
	public int smallest(){
		int smallest = arraylist.get(0);
		
		for (int s = 0; s < arraylist.size(); s++) {
			if (arraylist.get(s) < smallest)
				smallest = arraylist.get(s);
		}
		System.out.println("Smallest # in the ArrayList is: "+smallest);
		return (smallest);
	}
}
