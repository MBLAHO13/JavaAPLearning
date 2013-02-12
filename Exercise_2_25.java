import java.util.Scanner;
public class Exercise_2_25 {
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter your GMT offset (-5 for EST): ");
	long gmt = userInput.nextLong();
	
	long totalMilliseconds = System.currentTimeMillis();
	
	long totalSeconds = totalMilliseconds / 1000;
	
	long currentSecond = (int)(totalSeconds % 60);
	
	long totalMinutes = totalSeconds / 60;
	
	long currentMinute = totalMinutes % 60;
	
	long totalHours = totalMinutes / 60;
	
	long currentHour = (totalHours + gmt) % 24;
	
	System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" 
		+ currentSecond );
		
	}
}	