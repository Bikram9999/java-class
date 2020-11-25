package day32_StringBuffer;

import java.util.StringTokenizer;

public class StringDemo9 {
	

	public static void main(String[] args) {
		String lines = "Hello,, I'm Bikram Thapa,, I'm joining the java class,, I do love the java class most. ";
		String[] words = lines.split(",");
		System.out.println(words.length);
		for(String w: words) {
			System.out.println(w);
	
		}
		System.out.println("=======");
		StringTokenizer st = new StringTokenizer(lines, ",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());

	
}
}
}