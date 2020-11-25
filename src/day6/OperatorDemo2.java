package day6;

public class OperatorDemo2 {

	public static void main(String[] args) {
		// 3.Increment/decrement Operator
		// ++  --
		// post        pre
		//a++ a--      ++a  --a
		
		int i = 5;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		int a = 6;
		System.out.println(a);//6
		System.out.println(a++);//6
		System.out.println(a);//7
		
		int m = 5;
		int n = m++;//Assignment operator
		System.out.println(m);//6
		System.out.println(n);//5
		
		int x = 7;
		x = (x++) + (++x) + x + 1;
		System.out.println(x);//26
		

	}

}
