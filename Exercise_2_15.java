import java.util.Scanner;
public class Exercise_2_15{
	public static void main (String[] args){
	
	/**I call upon the mighty formula A = P(1 + (r/n))^(nt) because there is no way
 in Hades I am coding all that hot mess for six months. Algebra 2 taught me better than that.
 P = principal amount (the initial amount you borrow or deposit)
 r  = annual rate of interest (as a decimal)
 t  = number of years the amount is deposited or borrowed for.
 A = amount of money accumulated after n years, including interest.
 n  =  number of times the interest is compounded per year **/
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the initial amount you borrow or deposit: ");
	double P = userInput.nextDouble();
	
	System.out.println("Enter the annual rate of interest as a decimal: ");
	double r = userInput.nextDouble();
	
	System.out.println("Enter the number of years: ");
	double t = userInput.nextDouble();
	
	double n = 12.0; //we know it's monthly
	
	double accountBalance = P * Math.pow((1 + (r / n)), (n * t));
	
	accountBalance = (int)(accountBalance * 100) / 100;
	
	System.out.println("Your account balance after " + t + " years is $" + accountBalance);
	}
}
	