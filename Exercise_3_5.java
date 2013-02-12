import java.util.Random;
import java.util.Scanner;

public class Exercise_3_5 {
public static void main (String[] args) {

int firstInteger = (int) (Math.random() * 100); //put parenthesis or it becomes 0 all the time
int secondInteger = (int) (Math.random() * 100);
int thirdInteger = (int) (Math.random() * 100);

int answer = firstInteger + secondInteger + thirdInteger;

System.out.println("Add " + firstInteger + " and " + secondInteger + " and " + thirdInteger + ": ");

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