import java.util.Scanner; 

public class Q3A1B {
 	public static void main(String[] args) {
 	
	//let's write some code y'all
	
	Scanner myInput = new Scanner(System.in);
	
	//number of students determines number of elements in array
	System.out.println("How many students do you have?");
	int numberOfStudents = myInput.nextInt();
	//create array with that
	double[] studentArray = new double[numberOfStudents];
	
	//loop to take in scores
	int i = 0; //array counter
	//FLAG AREA
	System.out.println("Enter their scores.");
	
	for (int count = numberOfStudents; count != 0; count--) {
		studentArray[i] = myInput.nextDouble();	
		i++;
		} //EOL
	
	//compare process
	
	i = 0; //array counter
	double compare = 0;
	
	for (int count2 = 0; count2 < studentArray.length; count2++) {
		
		if  (studentArray[i] > compare) {
			compare = studentArray[i];
			} //EOI
		i++;
		} //EOL
	
	//now assigning grades
	
	double a = compare - 10;
	double b = compare - 20;
	double c = compare - 30;
	double d = compare - 40;
	
	double count3 = numberOfStudents;
	i = 0;
	
	while (count3 != 0) {
		if (studentArray[i] >= a) {
			System.out.println("Student " + (i + 1) + " received an A.");
			count3--; //hey look, let's not have an infinite loop.
			i++; //also, let's move through the array
			}
		else if (studentArray[i] >= b) {
			System.out.println("Student " + (i + 1) + " received a B.");
			count3--;
			i++;
			}
		else if (studentArray[i] >= c) {
			System.out.println("Student " + (i + 1) + " received a C.");
			count3--;
			i++;
			}
		else if (studentArray[i] >= d) {
			System.out.println("Student " + (i + 1) + " received a D.");
			count3--;
			i++;
			}
		else {
			System.out.println("Student " + (i + 1) + " gets a participation grade and a pat on the back.");
			count3--;
			i++;
			} // EOIE
		} //EOW
	} //EOM
} //EOF
	