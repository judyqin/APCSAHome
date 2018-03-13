package FixedElevens;

import Unit9.Card;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card card1 = new Card("ace", "spades", 1);
		Card card2 = new Card("ace", "spades", 1);
		System.out.print("does card1 match card2 (true or false)? " + card1.matches(card2) + "\n");
		System.out.println(card1.toString());
	}
}
