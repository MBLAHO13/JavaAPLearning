import java.util.Scanner;
public class Exercise_2_24 {
	public static void main (String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter v and a: ");
	double v = userInput.nextDouble();
	double a = userInput.nextDouble();
	
	 //calculus multiplication notation does not work in java, need that *
	
	System.out.println("The minimum runway length is " + (Math.pow(v, 2)/ (2 * a)));
	
	}
}