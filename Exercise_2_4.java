import java.util.Scanner;
public class Exercise_2_4 {
	public static void main (String[] args) {
		System.out.println("Enter a number in pounds: ");
		Scanner userInput = new Scanner(System.in);
		double pounds = userInput.nextDouble();
		System.out.println(pounds + " pounds is " + (pounds *.454) + " kilograms");
	}
}