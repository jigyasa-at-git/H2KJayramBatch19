package controlstatement;

public class Person {


		private String name;
		private int age;
		private String occupation;
	
		public void setAge(int ageX){
			if (ageX<=0){
				age =1;
			}else{			
			age = ageX;	
			}
		}
		
		public void setName(String name){			
			this.name = name;					
		}
		
		public void setAge(String occX){			
			occupation = occX;					
		}
		
		public int getAge(){
			
			return age;
		}
		
		public void printDetails(){
			
			System.out.println(name +" "+age + " "+occupation);
		}
	
	
}