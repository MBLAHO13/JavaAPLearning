import java.util.Scanner;
public class Exercise_2_3 {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter feet as a decimal: "); 
		double feet = userInput.nextDouble();
		System.out.println(feet + " feet is " + (feet * .305) + "meters");
	}
}