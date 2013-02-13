import java.util.Scanner; 

public class Q3A3A {
	public static void main(String[] args) {
	
		Scanner myInput = new Scanner(System.in);
		System.out.println("How many cards would you like to see?");
		int numCards = myInput.nextInt();
		int[] deck = new int[52];
		
		
		deck = InitializeCards(deck);
		
		deck = ShuffleTheDeck(deck);
		
		DisplayTheCards(deck, numCards);
		} //EOM
		
	public static int[] InitializeCards(int[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
			} //EOFL
		return list;
		} //EOIC
	
	public static int[] ShuffleTheDeck(int[] list) {
		for (int i = 0; i < list.length; i++){
			int index = (int)(Math.random() * list.length);
			int temp = list[i];
			list[i] = list[index];
			list[index] = temp;
			} //EOFL
		return list;
		} // EOSTD
	
	public static void DisplayTheCards(int[] list, int number) {
		String[] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"};
		String[] ranks = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack", "Queen", "King"};
		//variable scope. This is where it gets used, this is where it's going. #yoco
		for (int i = 0; i < number; i++) {
			String suit = suits[list[i] / 13];
			String rank = ranks[list[i] % 13];
			System.out.println("Card number" + list[i] + ": " + rank + " of " + suit);
			} //EOFL
			return;
		} //EODTC
		
	} //EOF
		