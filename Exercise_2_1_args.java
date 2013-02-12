public class Exercise_2_1_args {
	public static void main (String[] args) {
		double input = Double.parseDouble(args[0]);
		double temperatureCelcius = (int) (input *10) / 10;
		double output = temperatureCelcius * 1.8 + 32;
		double temperatureFahrenheit = (int) (output * 10) /10;
		System.out.println(temperatureCelcius + "˚ Celsius is " + temperatureFahrenheit + "˙ Fahrenheit");
	}
}