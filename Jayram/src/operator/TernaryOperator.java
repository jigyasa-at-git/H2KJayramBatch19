package operator;

public class TernaryOperator {

	public static void main(String[] args) {

		System.out.println(args[0]);
		System.out.println("TernaryOperator.main()");

		String batNumber = args[0];
		System.out.println("batNumber : "+batNumber);
		boolean isBatch19 = "batch19".equals(batNumber);
		System.out.println("isBatch19 = "+isBatch19);
		
/*		int batchNumer=isBatch19 ? 19 : 50 ;
		System.out.println("batchNumer : "+batchNumer);
*/		
		//OR
		
		int batchNumer="batch19".equals(batNumber) ? 19 : 50 ;
		System.out.println("batchNumer : "+batchNumer);
		
		// OR
		
/*		int batchNumer=("isBatch19" == batNumber) ? 19 : 50 ;
		System.out.println("batchNumer : "+batchNumer);
*/		
		
		// OR
		
/*		int batchNumer=("isBatch19" == batNumber) ? "BatchNineteen" : "Do Not Know" ;
		System.out.println("batchNumer : "+batchNumer);
*/	
		
	}

}
