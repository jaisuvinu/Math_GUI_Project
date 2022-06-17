package java01;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number :"));
		
		
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number :"));
		
		
		JOptionPane.showMessageDialog(null, "The greatest of two numbers is : " + Math.max(n1, n2));
		JOptionPane.showMessageDialog(null, "The smallest of two numbers is : " + Math.min(n1, n2));
		JOptionPane.showMessageDialog(null, "The sum of two numbers is : " + Math.addExact(n1, n2));
		JOptionPane.showMessageDialog(null, "The product of two numbers is : " + Math.subtractExact(n1, n2));
	}		
	
}