import java.util.Random;
import java.util.Scanner;

public class Exercise_3_21 {
public static void main (String[] args) {

//Zeller's congruence
//h = day of the week
//q = day of the month
//m = month
//j = century (year divided by 100)
//k = year of the century (year % 7)

Scanner userInput = new Scanner(System.in);

System.out.println("Enter the year:");
int year = userInput.nextInt();

System.out.println("Enter the month (0-12)");
int month = userInput.nextInt();

if (month > 12) {
	System.out.println("0 - 12 only.");
	System.exit(0);
	}
else if (month == 1) {
	int m = 13;
	--year;
	break;
	}
else if (month == 2) {
	int m = 14;
	--year;
	break;
	}
else 
	int m = month


	
	