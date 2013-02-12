import java.util.Scanner;
public class Exercise_2_22 {
	public static void main (String[] args) {
	final double CONSTANT = (3 * Math.pow(3, .5)) / 2;
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter one side of a regular hexagon.: ");
	
	double side = userInput.nextDouble();
	
	double area = CONSTANT * Math.pow(side, 2);
	
	System.out.println("The area of the regular hexagon is " + area);
	
	}
}