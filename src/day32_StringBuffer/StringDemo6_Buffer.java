package day32_StringBuffer;

public class StringDemo6_Buffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Good");
		System.out.println(sb);
		sb.append(" Morning");
		System.out.println(sb);
		sb.insert(0, "Hello, ");
		System.out.println(sb);
		sb.delete(0, 7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//difference between string builder and string buffer just because of synchronized.
				


	}

}
