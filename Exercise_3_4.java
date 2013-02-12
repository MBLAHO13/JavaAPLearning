import java.util.Random;
import java.util.Scanner;

public class Exercise_3_4 {
public static void main (String[] args) {

int firstInteger = (int) (Math.random() * 100);
int secondInteger = (int) (Math.random() * 100);

int answer = firstInteger + secondInteger;

System.out.println("Add " + firstInteger + " and " + secondInteger + ": ");

Scanner userInput = new Scanner(System.in);

int userAnswer = userInput.nextInt();

if (userAnswer == answer) {
	System.out.println("Correct, the answer is " + answer);
	}
else {
	System.out.println("Retake basic math. The answer is " + answer);
	}
}
}