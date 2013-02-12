import java.util.Scanner;
public class Exercise_2_23 {
	public static void main (String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter v0, v1, and t: ");
	double v0 = userInput.nextDouble();
	double v1 = userInput.nextDouble();
	double t = userInput.nextDouble();
	
	System.out.println("The average acceleration is " + ((v1 - v0) / t));
	
	}
}