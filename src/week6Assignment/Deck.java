package week6Assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
// A list of the cards within the deck
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits) {
			int count = 2;
			for (String value : values) {
				Card card = new Card ();
				String str = (value + " of " + suit);
				
				card.setName(str);
				card.setValue(count);
				
				this.cards.add(card);
				
				count++;
			}
		}
		
	}
	
// Randomizes the order of cards within the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
// Returns the top card and removes it from the deck
	public Card draw() {
		return cards.remove(0);
	}
	
	public int size() {
		return cards.size();
	}
}
