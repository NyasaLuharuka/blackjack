package blackjack1;

import java.util.Random;

public class Deck {
	
	private Card [] deck = new Card[52];
	private char [] suits = {'S', 'D', 'H', 'C'};
	private int counter = 0;
	
	public Deck() {
		int counter = 0;
				while (counter <= deck.length-1) {
					for (char suit : suits) {
						for (int i = 1; i < 14; i++) {
							deck[counter]=new Card(suit, i);
							counter++;
				}
			}
		}
	}
	
	public void shuffleDeck() {
		Random rand = new Random();
		Card temp;
		for (int i = 0; i < deck.length; i++) {
			int first = rand.nextInt(deck.length);
			int second = rand.nextInt(deck.length);
			temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card getCard() {
		Card card = deck[counter];
		counter++;
		return card;
	}
}