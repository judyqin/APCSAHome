package Unit9;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String ranks[] = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String suits[] = {"hearts", "diamonds", "clubs", "spades"};
		int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; 
		
		Deck d = new Deck(ranks, suits, values);
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		
		System.out.println("Deck has " + d.size() + " cards left.\n");
		System.out.println(d.toString());
		
		
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}