import java.util.Scanner;
public class Exercise_2_14{
	public static void main (String[] args){
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter Weight in pounds: ");
	double weight = userInput.nextDouble();
	weight = weight * 0.45359237;
	
	System.out.println("Enter height in inches: ");
	double height = userInput.nextDouble();
	height = height * .0254;
	
	double bmi = weight / (Math.pow(height, 2));
	
	System.out.println("BMI is " + bmi);
	}
}
	
	