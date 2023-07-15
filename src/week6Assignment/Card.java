package week6Assignment;

public class Card {

	// Contains the numbers used to represent the value of the card, from 2-14
	private int value; 
// Contains the name of the card
	private String name; 
	
// Returns the number value of the card
	public int getValue() {
		return value;
	}
// Returns the name value of the card
	public String getName() {
		return name;
	}
	
// Sets the number value of the card
	public void setValue(int v) {
		value = v;
	}
	
// Sets the name value of the card
	public void setName(String n) {
		name = n;
	}

// Prints the information about a card
	public void describe() {
		String s1 = "Your card: " + name;
		String s2 = "The value of your card: " + value;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
