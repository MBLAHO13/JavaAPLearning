import java.util.Scanner;
public class Q3A1A {
	public static void main(String[] args) {
		//hey look, variables
		double rate = 0.05;
		double monthlyPayment = 0;
		double totalPayment = 0;
		
		Scanner myScanner = new Scanner(System.in);
		//user-generated numbers
		System.out.println("Amount of principal: ");
		double principal = myScanner.nextDouble();
		
		System.out.println("How many years? ");
		double years = myScanner.nextDouble();
		
		System.out.println("Rate:\t\tMonthly:\tTotal: ");
		//The Loop. it does stuff if something's true.
		while (rate < 0.081) { 
			//it DOES have to be .081... but because of double inaccuracy. :(
			monthlyPayment = principal * (rate/1200) / (1 - 1 / Math.pow(1 + (rate/1200), years * 12));
			totalPayment = 	monthlyPayment * years * 12;
			
			System.out.println((int)(rate * 100000) / 1000.0 + "% \t \t" + 
				"$" +(int)(monthlyPayment * 100)/ 100.0 + " \t \t" + 
				"$" + (int)(totalPayment * 100)/ 100.0);
				//crude output formatting		
			rate += 0.00125;
			
			} //close loop
		} //close main
	} //EOF