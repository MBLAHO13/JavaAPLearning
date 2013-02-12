public class Exercise_2_19{
	public static void main (String[] args){
	
	double time = System.currentTimeMillis();
	
	char ch = (char) (time % 26 + 65);
	
	System.out.println(ch);
	
	}
}