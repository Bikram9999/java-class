package day32_StringBuffer;

public class StringDemo5_Mutable {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);//this is builder
		sb.append(" Morning");//append is same as concat means merge object
		System.out.println(sb);
		sb.insert(0, "Hello, ");
		System.out.println(sb);
		sb.delete(0, 7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
				

		
		
	}

}
