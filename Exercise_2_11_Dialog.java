  import javax.swing.JOptionPane;

public class Exercise_2_11_Dialog {
  public static void main(String[] args) {
  	
  	
  	String employeeName = JOptionPane.showInputDialog(null, "Enter the Employee's name", "The Employee's name Is:", JOptionPane.QUESTION_MESSAGE);
  	String inputHours = JOptionPane.showInputDialog(null, "Enter number of hours worked in number format", "They worked:", JOptionPane.QUESTION_MESSAGE);
  		double hoursWorked = Double.parseDouble(inputHours);
  	String inputPay = JOptionPane.showInputDialog(null, "Enter hourly rate", "Dollars Per hour in Decimal format:", JOptionPane.QUESTION_MESSAGE);
  		double payRate = Double.parseDouble(inputPay);
  	String inputFederalTaxRate = JOptionPane.showInputDialog(null, "Enter Federal Tax rate as a decimal", "The Federal tax rate is:", JOptionPane.QUESTION_MESSAGE);
  		double taxFederal = Double.parseDouble(inputFederalTaxRate);
  	String inputStateTaxRate = JOptionPane.showInputDialog(null, "Enter State Tax Rate as a Decimal", "The state tax rate is:", JOptionPane.QUESTION_MESSAGE);
  		double taxState = Double.parseDouble(inputStateTaxRate);
  
  	double grossPay = (int) ((hoursWorked * payRate) *100)/ 100.0;
  	double withholdingFederal = (int) ((grossPay * taxFederal) * 100)/ 100.0;
  	double withholdingState = (int) ((grossPay * taxState) *100) / 100.0;
  	double totalDeduction = withholdingFederal + withholdingState;
  	double netPay = grossPay - totalDeduction;
  	
  	JOptionPane.showMessageDialog(null, "Employee Name: "+ employeeName
  		+"\nHours worked: " + hoursWorked + "\nPay Rate: $" + payRate + " per hour\n" 
  		+ "Gross Pay: $" + grossPay + "\nDeductions:\n"
  		+"	Federal Withholding (20.0%): $" + withholdingFederal + "\n	State Withholding (9.0%): $" + withholdingState 
  		+"\n	Total Deduction: $" + totalDeduction + "\nNetPay: $" + netPay);
  		//apparently you CAN stick a new line break in the middle of the string. TIL.
    }
  
}