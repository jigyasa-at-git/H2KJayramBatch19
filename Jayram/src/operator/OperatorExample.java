package operator;

public class OperatorExample {

	public static void main(String[] args) {
		
		int age ; // declaration
		age = 0; // initialization
		
		age++; //age = age + 1;
		System.out.println(age);
		
		age += 2; //age = age + 2;
		System.out.println(age++); // post increment
		System.out.println(++age); // pre increment

		
		int height = 40;
		height *= 2; // height = height * 2;
	}

}
