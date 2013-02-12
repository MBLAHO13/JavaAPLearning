import java.util.Scanner;

public class Exercise_2_8{
	public static void main (String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter an ASCII code: ");
	int asciiCode = userInput.nextInt();
	char ch = (char)asciiCode;
	System.out.println("The character for ASCII code " + asciiCode + " is " + ch);
	}
}