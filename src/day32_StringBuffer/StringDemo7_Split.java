package day32_StringBuffer;

public class StringDemo7_Split {

	public static void main(String[] args) {
		String lines = "Hello, I'm Bikram Thapa, I'm joining the java class, I do love the java class most. ";
		String[] words = lines.split(" ");
		for(String w: words) {
			System.out.println(w);
			
		}
		
		System.out.println("============");
		words = lines.split(",");
		for(String w: words) {
			System.out.println(w);
		}
		
		

	}

}
