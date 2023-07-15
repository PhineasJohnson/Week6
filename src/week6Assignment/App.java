package week6Assignment;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for(int i = 0; i <= deck.size()/2; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		player1.describe();
		player2.describe();
		
		for(int i = 0; i <= deck.size()/2; i++) {
			int v1 = player1.flip().getValue();
			int v2 = player2.flip().getValue();
			
			if(v1 > v2) {
				player1.incrementScore();
			} else if(v2 > v1) {
				player2.incrementScore();
			} else {
				// Do nothing.
			}
		}
		
		System.out.println(player1.getScore());
		System.out.println(player2.getScore());
	}
}
