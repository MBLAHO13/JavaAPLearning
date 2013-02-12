import java.util.Scanner;
public class Exercise_2_20 {
	public static void main (String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter x1 and y1: ");
	double x1 = userInput.nextDouble();
	double y1 = userInput.nextDouble();
	
	System.out.println("Enter x2 and y2: ");
	double x2 = userInput.nextDouble();
	double y2 = userInput.nextDouble();
	
	double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), .5);
	
	System.out.println("The distance of the two points is " + distance); 
	
	}
}