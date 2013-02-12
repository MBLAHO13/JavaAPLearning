import java.util.Scanner;
public class Exercise_2_21 {
	public static void main (String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	//reuse our handy-dandy Distance formula
	System.out.println("Enter x1 and y1: ");
	double x1 = userInput.nextDouble();
	double y1 = userInput.nextDouble();
	
	System.out.println("Enter x2 and y2: ");
	double x2 = userInput.nextDouble();
	double y2 = userInput.nextDouble();
	
	System.out.println("Enter x3 and y3: ");
	double x3 = userInput.nextDouble();
	double y3 = userInput.nextDouble();
	
	// Combinations of sides: 1-2, 2-3, 1-3
	
	double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), .5); 
	//takes care of 1-2, remaining are 2-3, 1-3
	
	double side2 = Math.pow((Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)), .5);
	//takes care of 2-3, remaining is 1-3
	
	double side3 = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), .5);
	//all sides measured
	
	//s = superside 
	double s = (side1 + side2 + side3)/2;
	
	double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), .5);
	
	System.out.println("The area of the triangle is " + area);
	
	}
}
	 