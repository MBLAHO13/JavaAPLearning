import java.util.Scanner; 

public class Exercise_2_9{
	public static void main (String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter an amount without the decimal point: ");
	int amount = userInput.nextInt();
	
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
	
	System.out.println("Your amount $" + printAmount + " consists of \n" +
	"\t" + numberOfOneDollars + " dollars\n" +
	"\t" + numberOfQuarters + " quarters\n" +
	"\t" + numberOfDimes + " dimes \n" +
	"\t" + numberOfNickels + " nickels \n" +
	"\t" + numberOfPennies + " pennies\n");
	}
}
	