package Assignment3;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		
		String r = JOptionPane.showInputDialog("Enter radius: ");
		double radius = Double.parseDouble(r);
		
		double areaOfCircle = PI * radius * radius;
		JOptionPane.showMessageDialog(null, "Area of circle is: " + areaOfCircle);
				
		
				

	}

}
