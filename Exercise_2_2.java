import java.util.Scanner;

public class Exercise_2_2 {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = userInput.nextDouble();
		double length = userInput.nextDouble();
		System.out.println("Area is " + radius * radius * 3.14159); //do it on one line to save memory
		System.out.println("Volume is " + radius * radius * 3.14159 * length);
		}
	}