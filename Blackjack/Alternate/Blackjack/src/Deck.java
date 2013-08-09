import java.util.*;
public class Deck {
	private ArrayList<Card> deck;
	
	public Deck()
	{
		deck = new ArrayList<Card>();
	}
	
	public void resetDeck()
	{
		for (int i = 0; i <= 103; i++)
			deck.add(new Card((i%13+1),i));
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	
	public Card draw()
	{
		return (deck.remove((int)(Math.random()*(deck.size())))); // removes a random card
	}

}
