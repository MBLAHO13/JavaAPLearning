 import javax.swing.JOptionPane;

public class Exercise_2_10{
	public static void main (String[] args){
	//System.out.println("Enter an amount without the decimal point: ");
	
	String userInput = JOptionPane.showInputDialog("Enter an amount: ");
	double amountDouble = Double.parseDouble(userInput);
	
	int amount = (int)(amountDouble * 100); //explicitly cast that thing before it gets out of hand!
	
	int numberOfOneDollars = amount / 100;
	int remainingAmount = amount % 100;
	
	int numberOfQuarters = remainingAmount / 25;
	remainingAmount = remainingAmount % 25;
	
	int numberOfDimes = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;
	
	int numberOfNickels = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;
	
	int numberOfPennies = remainingAmount;
	
	double printAmount = (double)amount / 100;
	
	JOptionPane.showMessageDialog(null, "Your amount $" + printAmount + " consists of \n" +
	"\t" + numberOfOneDollars + " dollars\n" +
	"\t" + numberOfQuarters + " quarters\n" +
	"\t" + numberOfDimes + " dimes \n" +
	"\t" + numberOfNickels + " nickels \n" +
	"\t" + numberOfPennies + " pennies\n");
	}
}