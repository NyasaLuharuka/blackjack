package blackjack1;


public class Card {
	private char suit;
	private int value;
	
	public Card() {
		suit = 'S';
		value = 0;
	}
	
	public Card(char suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public char getSuit() {
		return suit;
	}
	
	public int getValue() {
		if (value == 11 || value == 12 || value == 13) {
			return 10;
		}
		else {
			return value;
		}
	}
	
	@Override
	public String toString() {
		String cardValue = String.valueOf(this.value);
		String cardSuit = Character.toString(this.suit);
		return cardSuit+cardValue;
	}
	
}
