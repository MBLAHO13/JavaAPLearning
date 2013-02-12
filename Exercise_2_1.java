import java.util.Scanner;
public class Exercise_2_1 {
	public static void main (String[] args) {
		Scanner temperatureInput = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		int temperatureCelcius = temperatureInput.nextInt();
		double temperatureFahrenheit = temperatureCelcius * 1.8 + 32;
		System.out.println(temperatureCelcius + "˚ Celsius is " + temperatureFahrenheit + "˙ Fahrenheit");
		
	}
}
		
	
