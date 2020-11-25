package day32_StringBuffer;

import java.util.StringTokenizer;

public class StringDemo8_Tokenizer {

	public static void main(String[] args) {
		String lines = "Hello, I'm Bikram Thapa, I'm joining the java class, I do love the java class most. ";
		StringTokenizer st = new StringTokenizer(lines);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		} 
		System.out.println("======");
		st = new StringTokenizer(lines, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		
			
		}
				
		



	}

}
