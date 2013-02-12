import javax.swing.*;

public class Exercise_2_12_dialog{
	public static void main (String[] args) {
	
	String userInput = JOptionPane.showInputDialog("Enter your balance: ");
	double balance = Double.parseDouble(userInput);
	

	
	userInput = JOptionPane.showInputDialog("Enter your interest rate without the percent sign. Do not decimalize it: ");
	double interestRate = Double.parseDouble(userInput);
	 
	
	float interest = (float)balance * (float)(interestRate / 1200); //cast to float or you lose precision
	/** I'm assuming that this formula takes into account that the percent needs to be divided.
	In the formula I learned, interestRate is over 12, so i guess the 1200 is compensating for 
	the inflated percent. **/
	
	JOptionPane.showMessageDialog(null,"The interest is " + interest);
	}
}
	