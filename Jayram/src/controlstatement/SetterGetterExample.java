package controlstatement;

public class SetterGetterExample {

	public static void main(String[] args) {

		Person per = new Person();
//		per.age = -16;
//		per.name = "Jigs";
//		per.occupation = "Tester";
		
		per.setAge(-10);
		per.setName("Jigs");
		per.setAge("Tester");
		
		per.printDetails();
		
		System.out.println(per.getAge());
		
	}

}
