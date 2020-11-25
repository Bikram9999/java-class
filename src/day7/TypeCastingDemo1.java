package day7;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		
		//implicit type conversion
		//by java complier 
		byte b1 = 127;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);
		
		//explicit type conversion
		//by java programmer
		int i2 = 127;
		byte b2 = (byte) i2;//we can easily put smaller value to big value 
		                    //but not big value to small value//forcefully written(byte whatever)
		
		System.out.println(i2);
		System.out.println(b2);
		
		double d = 300.56;
		int i = (int) d;
		System.out.println(d);
		System.out.println(i);
		
		//boolean bb = true;
		//int i = (int) bb; type conversion is not applied
		
		

	}

}
