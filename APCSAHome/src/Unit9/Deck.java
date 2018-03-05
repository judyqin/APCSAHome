package Unit9;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private List<Card> cards;
	
	//Unit 9 - Array version of the Deck
	private String ranks[] = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
	private String suits[] = {"hearts", "diamonds", "clubs", "spades"};
	private int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; 
	private Card[] cards = new Card[52];

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		this.ranks = ranks; 
		this.suits = suits; 
		this.values = values;
		
		for (int i = 0; i < cards.length; i++)
		{
			cards[i] = new Card(ranks[i%13], suits[i/13], values[i%13]); 
		}
		size = 52; 
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0)
		{
			return true; 
		}
		else 
		{
			return false; 
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size; 
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		for(int i = cards.length-1; i >= 0 ; i--){
			int r = (int) Math.round((Math.random()  * i));			
			Card shuffled = cards[i];
			cards[i] = cards[r];
			cards[r] = shuffled;
		}
		
		size = ranks.length * suits.length;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (isEmpty())
		{
			return null;
		}
		else 
		{
			size -= 1; 
			return cards[size];
		}
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";


		//Unit 9 - modify to work with Arrays
		
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		

		rtn = rtn + "\n";
		return rtn;
	}
}