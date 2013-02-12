import java.util.Scanner;
public class Exercise_2_5 {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = userInput.nextDouble();
		double rate = userInput.nextDouble();
		double ratePercent = rate / 100;
		double tip = subtotal * ratePercent;
		double total = subtotal + tip;
		System.out.println("The gratuity is " + tip + " and the total is " + total);
	}
}