public class Q3A2B {
  public static void main(String[] args) {
  
 	 //Accepts no input. Like some people I know of.
  
  	double picker1 = Math.random(); 
  	double picker2 = Math.random();
  
  	int x = (int)(picker1 * 10); //x-coord of matrix. gets passed to matrix method.
  	int y = (int)(picker2 * 10); //y-coord of matrix. gets passed to matrix method.
  	
  	printMatrix(x,y);
  
  } //EOM
  
  /* The x is how long, the y is how tall. so in the code to traverse 2D's,
  	the x coord has to be in the inside loop, and the y coord has to be in the outside loop 
  	as per the array in an array philosophy. also within the loop has to be the random generator 
  	and the even-odd decision loop. Basic procedure:
  		* Outside loop decides whether or not to start a new row
  		* inside loop builds the rows. this loop contains:
  			* random generator
  			* 0/1 decision loop
  			* print statement with tabs and spaces
  			* falls through upon row end, moves to outside loop
  	Go team. 
  	*/
	
	public static void printMatrix(int num1, int num2) { 
		//Accepts no input. 
		double picker3 = 0;
		if ( num1 == 0 || num2 == 0){ //checks for a 0 by x matrix, would cause no output
			num1++;
			num2++;
			} //EOI
			
		for (int row = 0; row < num2; row++) { //F1
			for (int column = 0; column < num1; column++) { //F2
				picker3 = Math.random();
				int picker4 = (int)(picker3 * 10);
				
				if (picker4 % 2 == 0){ //if even, print 0
					System.out.print("0  ");
					}
				else {	//if odd, print 1
					System.out.print("1  ");
					} //EOIE
				}//EOF1
			System.out.println(); // insert line break to begin new line
			} //EOF2
		return; //break method, void method
		} //EOpM
	} //EOF