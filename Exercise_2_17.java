import java.util.Scanner;
public class Exercise_2_17{
	public static void main (String[] args){
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter the temperature (T) in Fahrenheit (-58 > T > 41): ");
	double T = userInput.nextDouble();
	
	if (T > 41) {
		System.out.println(" PEBKAC Error");
		System.exit(0);
	} else if (T < -58) {
		System.out.println(" PEBKAC Error");
		System.exit(0);
	} else {
		System.out.println("Valid Value.");
		}
	
	System.out.println("Enter the wind speed (WS) in miles per hour (WS >= 2): ");
	double V = userInput.nextDouble();
	
	 if (V < 2) {
		System.out.println(" PEBKAC Error");
		System.exit(0);
	} else {
		System.out.println("Valid Value.");
		}
	double chill = 35.74 + (0.6215 * T) - (35.75 * Math.pow(V, 0.16)) + (0.4275 * T * Math.pow(V, 0.16));
	//that's what they wanted, right?
	System.out.println("The wind chill index is " + chill);
	}
}
