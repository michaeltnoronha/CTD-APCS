import javax.swing.*;
import java.awt.*;

public class Driver 
{
	private static int userStartMoney;
	private static int userBetInput;
	
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		deck.resetDeck();
		Player Player1 = new Player();
		Computer Dealer = new Computer();
		ImagePanel panel = new ImagePanel(Player1, Dealer, deck);
		StartingMoney start = new StartingMoney(panel,Player1,deck,Dealer);
		Player1.setPanel(panel);
		Dealer.setPanel(panel);
		Player1.hit(deck);
		Player1.hit(deck);
		Dealer.hit(deck);
		Dealer.hit(deck);

	}
	
	

	
}

