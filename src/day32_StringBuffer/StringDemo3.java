package day32_StringBuffer;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = "Good Evening";//index start with 0
		System.out.println(s1);
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 4));//just find first word= 0-1
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('n'));
		System.out.println(s1.charAt(6));
		char [] ch = s1.toCharArray();
		System.out.println(ch[5]);
		System.out.println(s1.contains("Good"));
		System.out.println(s1.contains("z"));
		System.out.println(s1.replace("Evening", "morning"));
		System.out.println(s1.replace("Good", "People"));
		System.out.println("Hello, ".concat(s1));//before good
		System.out.println(s1.concat(" Chicago."));//after evening
		
		String s2 = " Bikram Thapa ";
		System.out.println(s2);
		System.out.println(s2.trim());//it fixes space
		byte [] bb = s1.getBytes();
		System.out.println(bb);
		
		System.out.println(s1.length());

	}

}
