import java.util.Scanner;

public class Exercise_2_12_scanner{
	public static void main (String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter your balance: ");
	double balance = userInput.nextDouble();
	
	System.out.println("Enter your interest rate without the percent sign. Do not decimalize it: ");
	double interestRate = userInput.nextDouble();
	//Doing it on one line is for losers. 
	
	float interest = (float)balance * (float)(interestRate / 1200); //cast to float or you lose precision
	/** I'm assuming that this formula takes into account that the percent needs to be divided.
	In the formula I learned, interestRate is over 12, so i guess the 1200 is compensating for 
	the inflated percent. **/
	
	System.out.println("The interest is " + interest);
	}
}
	
	