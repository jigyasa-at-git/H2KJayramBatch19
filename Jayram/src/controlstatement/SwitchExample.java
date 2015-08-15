package controlstatement;

public class SwitchExample {

	public static void main(String[] args) {

		int ages[] = {1,3,5,7,8,2,3,90};
		
		for (int age : ages){
			
		 switch(age){
		 
		 case 1:
			 System.out.println("Age is one" );
			 break;
		 case 2:
			 System.out.println("Age is two" );
			 break;
		 case 3:{
			 System.out.println("Age is three" );
			 System.out.println("And I can tie my shoe strings!!");
			 break;
		 }
		 case 5:
			 System.out.println("Age is five" );
			 break;
		 case 8:
			 System.out.println("Age is eight" );
			 break;
		 default:
			 break;
			 
		 }
			
		}
	}

}
