package day32_StringBuffer;

public class StringDemo4_Immutable {

	public static void main(String[] args) {
		String s1 = "Good";
		System.out.println(s1);
       String s2 = s1.concat(" Morning");
		System.out.println(s2);
		//s1.concat(morning)
		//system.out.print(s1) this is immutable object

	}

}
