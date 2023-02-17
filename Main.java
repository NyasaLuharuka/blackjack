package blackjack1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffleDeck();
	
		int Value1 = 0;
		int Value2 = 0;
		
		Card [] playerHand = new Card[11];
		Card [] dealerHand = new Card[11];
		
		playerHand[0] = deck.getCard();
		System.out.println("Player: " + playerHand[0]);
		Value1 += playerHand[0].getValue();
		playerHand[1] = deck.getCard();
		System.out.println("Player: " + playerHand[1]);
		Value1 += playerHand[1].getValue();
		
		System.out.println("");
		
		dealerHand[0] = deck.getCard();
		System.out.println("Dealer: FACE DOWN CARD");
		Value2 += dealerHand[0].getValue();
		dealerHand[1] = deck.getCard();
		System.out.println("Dealer: " + dealerHand[1]);
		Value2 += dealerHand[1].getValue();
		
		System.out.println("");
		
		for (int i = 2; i<=11;i++) {
			Scanner myObj = new Scanner(System.in);
		    System.out.println("h/s: ");
		    String userInput = myObj.nextLine();
		    if (userInput.compareTo("h") == 0) {
		    	playerHand[i] = deck.getCard();
				System.out.println("Player: " + playerHand[i]);
				Value1 += playerHand[i].getValue();
				if (Value1 > 21) {
					System.out.println("You bust!");
					break;
				}
		    }
		    else if (userInput.compareTo("s") == 0) {
		    	break;
		    }
		}
		
		System.out.println("");
		System.out.println("FACE DOWN CARD: " + dealerHand[1]);
		System.out.println("2nd Card: " + dealerHand[0]);
		System.out.println("");
		
		for (int j = 2; j<=11; j++) {
			if (Value2 < 17) {
				dealerHand[j] = deck.getCard();
				System.out.println("Dealer: " + dealerHand[j]);
				Value2 += dealerHand[j].getValue();
				if (Value2 > 21) {
					System.out.println("Dealer Bust!");
					return;
				}
			}
			System.out.println("");
			System.out.println("Results:");
			System.out.println("Dealer: " + Value2);
			System.out.println("Player: " + Value1);
			return;
		}
		
	}
}
