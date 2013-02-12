import java.util.Scanner;

public class Exercise_2_11_Scanner {
  public static void main(String[] args) {
  	Scanner myScanner = new Scanner(System.in);
  	
  	System.out.println("Enter employee's name: ");
  	String employeeName = myScanner.next();
  	System.out.println("Enter number of hours worked: ");
  	double hoursWorked = myScanner.nextDouble();
  	System.out.println("Enter hourly rate: ");
  	double payRate = myScanner.nextDouble();
  	System.out.println("Enter federal tax withholding rate: ");
  	double taxFederal = myScanner.nextDouble();
  	System.out.println("Enter state tax withholding rate: ");
  	double taxState = myScanner.nextDouble();
  
  	double grossPay = (int) ((hoursWorked * payRate) *100)/ 100.0;
  	double withholdingFederal = (int) ((grossPay * taxFederal) * 100)/ 100.0;
  	double withholdingState = (int) ((grossPay * taxState) *100) / 100.0;
  	double totalDeduction = withholdingFederal + withholdingState;
  	double netPay = grossPay - totalDeduction;
  	
  	System.out.println("Employee Name: "+ employeeName);
  	System.out.println("Hours worked: " + hoursWorked);
  	System.out.println("Pay Rate: $" + payRate + " per hour");
  	System.out.println("Gross Pay: $" + grossPay);
  	System.out.println("Deductions:");
  	System.out.println("	Federal Withholding (20.0%): $" + withholdingFederal);
  	System.out.println("	State Withholding (9.0%): $" + withholdingState);
  	System.out.println("	Total Deduction: $" + totalDeduction);
  	System.out.println("NetPay: $" + netPay);
    }
  
}