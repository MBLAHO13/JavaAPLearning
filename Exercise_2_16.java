import java.util.Scanner;
public class Exercise_2_16{
	public static void main (String[] args){
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the Amount of water in Kilograms: ");
	double kilogramsOfWater = userInput.nextDouble();
	
	System.out.println("Enter the initial Temperature in degrees Celsius: ");
	double initTemperature = userInput.nextDouble();
	
	System.out.println("Enter the final Temperature in degrees Celsius: ");
	double finalTemperature = userInput.nextDouble();
	
	float energy = (float) (kilogramsOfWater * (finalTemperature - initTemperature) * 4184);
	
	System.out.println("The energy needed is " + energy + " joules.");
	}
}
	
	