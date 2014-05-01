
import javax.swing.*;

public class Function {
	
	public static int myAge(int yrofBirth)
	
	{
		
		return 2014-yrofBirth;
		
		
	}

	public static void main ( String [] args)

	
	{
		
		String y = JOptionPane.showInputDialog("Enter yr of Birth");
		
		int z = Integer.parseInt(y);
		
		int x = myAge(z);
		
		System.out.println("My Age is " + x);
		JOptionPane.showMessageDialog(null, x);
		
	}
}
