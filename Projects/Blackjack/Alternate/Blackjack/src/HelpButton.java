import javax.swing.*;

import java.awt.*;

public class HelpButton extends JFrame{
	JPanel p1;
	public HelpButton(){
		p1 = new JPanel(new FlowLayout( FlowLayout.LEFT, 2, 2));
		JLabel helpText = new JLabel("<html>Hello, and welcome to the BlackJack tutorial. For English, press any key.  <br> To play BlackJack, first make the ante. The ante is the opening bet, necessary to begin the game. <br> For this game, the minimum bet is 5% of the player's starting money. After the bet has been approved, the game shall begin.	  <br> 		  <br> To begin with, both player and dealer are both dealt two cards from the deck. The cards add up to the player's total. To win, simply be the player closest to 21. <br> All cards are worth their face value, regardless of suit. The Royal cards(Jack, Queen, and King) are each worth 10. <br> The Ace, however, is special, and thus is worth either 1 or 11, depending on what the player believes is most beneficial at the time. <br> If a player goes over 21, it is called a bust, and the player automatically loses, regardless of the other player's score(Unless the dealer busts as well). <br> <br> The hit button asks the dealer to give you another card to bring your score closer to 21. This button can be used at any time, but be wary of busting.<br> The stay button ends your turn, and allows the dealer to go. This button can be pressed at any time, but only once per game.  <br> The surrender button can only be used once per game, and allows you to forfeit and keep half your money in the pot. Use this when you know the dealer will win. <br> Finally, the bet option is available after the starting hands have been dealt, and allows you to increase the money in the pool. It leads to higher risks, but higher potential returns. <br> <br> Special Rules:  <br> <br> These are the special rules that govern the game of BlackJack at this particular casino- <br> 1. 'Hard 17.' This rule forces the dealer to stay at 17, should he land on that number without an Ace. This rule greatly increases the player's chance of winning.  <br> 2. 'Double Decks.' Two decks are used to minimize the chance of a BlackJack. The more cards present in a shuffle, the smaller the chance of gaining an Ace or a Royal.  <br> 3. 'House Always Wins.' Whenever the dealer and the player tie, the win will always go to the dealer. The only exception to this rule is a BlackJack.  <br> 4. 'BlackJack.' Also known as 'Ace and a Face,' this is when either player is dealt both a Royal and an Ace. Not only does this beat all other combinations, but the payout for Blackjack is much higher than any other. <br> <br> <br> Finally, know that we here at the ACS Casino do not tolerate cheating of any sort. Any attempt to 'count' cards using memory or external devices will be discovered and dealt with severely. In a dark alley. With no one to hear you scream.  <br> We hope you enjoy your time here at the ACS Casino, and chose us for all your gambling pleasures.  <br> <br> <br> Have a gambling problem? call 888-424-3577 for help.");
		JLabel h = new JLabel("hi");

		p1.add(helpText);
		
		
		add(p1);
		this.setSize(1350,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	
}



