package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank)); 
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw(cardsInDeck) {
		for (int cardsInDeck[i] = 0; i < 4; i++)
			System.out.print(cardsInDeck[i]);
			if (Deck < 1)
				System.out.println("deck is empty");
				return cardsInDeck.remove(0);
	}
	
	//TODO: Write an overloaded Draw method to Draw a card of a given eSuit
	
	//TODO: Write an overloaded Draw method to Draw a card of a given eRank

	//TODO: Write a method that will return the number of a given eSuit left in the deck.
	
	//TODO: Write a method that will return the number of a given eRank left in the deck.
	
	//TODO: Write a method that will return 0 or 1 if a given card is left in the deck.
	
}
