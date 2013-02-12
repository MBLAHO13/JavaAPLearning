import java.util.Scanner;

public class Q3A2A {
  public static void main(String[] args) {
  
  	Scanner myInput = new Scanner(System.in);
  	String C = "C"; //for compare purposes, gotta use that .equals() sometime
  	String c = "c";
    
 	 System.out.println("Enter the unit of your measurement. C for Celsius and F for Fahrenheit. Case insensitive. ");
  
 	 String unit = myInput.next();
  
 	 System.out.println("Enter the magnitude of " + unit + ".");
  
 	 double magnitude = myInput.nextDouble();
  
 	 double newMagnitude = 0; //initialize for the loop
 	 if (unit.equals(C) || unit.equals(c)) { //case insensitive
 	 	newMagnitude = cToF(magnitude); 
 	 	unit = "F";
 	 	}
  		else { 
  		newMagnitude = fToC(magnitude); 
  		unit = "C";
  		} //EOL
  	//Extra credit -- harness the power of boolean!
  	if ( (unit == "F" && newMagnitude >= 90.0) || (unit =="C" && newMagnitude >= 33.0)) {
		System.out.println("The Temperature in " + unit + " is " + newMagnitude + unit + ". Too hot!");
		} 
	else if ( (unit == "F" && newMagnitude <= 32.0) || (unit =="C" && newMagnitude <= 0)) {
		System.out.println("The Temperature in " + unit + " is " + newMagnitude + unit + ". Wear a sweater.");
		}
	else {
		System.out.println("The Temperature in " + unit + " is " + newMagnitude + unit + ".");
			} //EOIE
		
	} //EOM
	
public static double cToF(double num1){
		double F = (num1 * (9.0/5)) + 32;
		return F;
	} //EOcToF

public static double fToC(double num1) {
		double C = (num1 - 32) * (5 / 9.0);
		return C;
	} //EOfToC
} //EOF
	
  	
  	
  