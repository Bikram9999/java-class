package day6;

public class OperatorDemo4 {

	public static void main(String[] args) {
		// 5. Logical Operator &&(and) ||(or) !(not)
		
		
		     System.out.println(true && true);//true results
             System.out.println(true && false);//false
             System.out.println(false && true);//false
             System.out.println(false && false);//false
             
             
             System.out.println("=============");
             System.out.println(true || true);//true results
             System.out.println(true || false);//true
             System.out.println(false || true);//true
             System.out.println(false || false);//false
             
             System.out.println(!true);//false result
             System.out.println(!false);//true result just opposite
             
             int a = 5;
             int b = 6;
             int c = 4;
             if ((a > b) || (a > c))  {
            	 System.out.println("a is greatest one");
            	
            	 
             }else { 
            	 System.out.println("kkk");
             }
	}

}
