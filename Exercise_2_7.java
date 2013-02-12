import java.util.Scanner; 
/** You know, seeing as bulk importing has no importance on performance, 
could I just do "import java*" at the beginning of every program and cheat? **/

public class Exercise_2_7{
	public static void main (String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter the number of minutes: ");
	int numberOfMinutes = userInput.nextInt();
	int numberOfHours = numberOfMinutes / 60;
	int numberOfDays = numberOfHours / 24;
	int numberOfYears = numberOfDays / 365;
	int numberOfDaysLeftOver = numberOfDays % 365;
	System.out.println(numberOfMinutes + " minutes is approximately " + numberOfYears
	+ " years and " + numberOfDaysLeftOver + " days.");		
	}
}