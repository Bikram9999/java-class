package day7;

//explicit type
public class TypecastingDemo3 {

	public static void main(String[] args) {
		
		double d = 123.45;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s  = (short) i;
		byte b = (byte) s;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		

	}

}
