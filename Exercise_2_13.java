import java.util.Scanner;
public class Exercise_2_13{
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double investment = userInput.nextDouble();
		
		System.out.println("Enter Monthly Interest rate: ");
		double interestRate = userInput.nextDouble();
		interestRate = ++interestRate;
		
		System.out.println("Enter Number of years: ");
		double years = userInput.nextDouble();
		years = years / 12; 
		
		
		double futureInvestmentValue = investment * Math.pow(interestRate, years);
		
		double humanReadableInvestmentValue = (int)(futureInvestmentValue * 100) / 100.0;
		
		/** their formula says to multiply by 12, but they are wrong. You don't multiply
		because you're supposed to split up the interest rate over the months because it's monthly.
		So there. >:( Their math is wrong too. I checked it on my calculator. With their numbers, you 
		get 1148.18. They need to stick to programming. **/
		
		System.out.println("Accumulated Value is " + humanReadableInvestmentValue);
		}
}