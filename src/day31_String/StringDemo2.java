package day31_String;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = "Nepal";
		String s2 = "Nepal";
		
		String s3 = new String("Nepal");
		String s4 = new String("Nepal");
		
		//worst way to compare string
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s3 == s4);//false
		
		//best way to compare string in java
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		String s5 = "nepal";
		System.out.println(s5.equalsIgnoreCase(s4));//true

	}

}
