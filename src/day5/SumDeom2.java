package day5;

import javax.swing.JOptionPane;

public class SumDeom2 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Enter a: " );//"7"
		String b = JOptionPane.showInputDialog("Enter b: ");//"8"
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int sum = aa + bb;
		JOptionPane.showMessageDialog(null, "Sum is: " + sum);


	}

}
