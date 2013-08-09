package blackjack_test.gui;

import java.awt.*;
import java.util.ArrayList;
import java.awt.Image;
import javax.swing.*;


import blackjack_test.base.Card;
import blackjack_test.base.Hand;

public class DealerPanel extends JPanel {

        private Hand hand;
        private int minBet;
        private Image cardImgs;        
        private JLabel minBetDisp;
        
        public DealerPanel(int minimumBet, Image cardImages) {
                super();
                setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //vertical layout
                setPreferredSize(new Dimension(99, 320));
                setOpaque(false); 
                setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY), "DEALER"));

                hand = null;
                minBet = minimumBet;
                cardImgs = cardImages;  
                minBetDisp = new JLabel("Minimum Wager: " +
                                                                "$<u>" + minBet + "</u></font></HTML>");
                minBetDisp.setFont(new Font(Font.SERIF, Font.BOLD, 18));
                add(minBetDisp);
        }
        
        public Hand getHand() {
        	return hand;
        }
        
        public ArrayList<Card> clearHand() {
                return hand.clearHand();
        }       
        
        public void startHand(Card c1, Card c2){
        hand = new Hand(c1, c2);
        }

        public void flipSecond () {
                hand.get(1).flip();
                repaint();
        }
        
        public boolean checkAce () {
                return hand.get(0).getFace() == Card.ACE;
        }
        
        @Override
        public void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (hand == null) return;
                for (int i = 0; i < hand.length(); i++) {
                        drawCard(g, hand.get(i), 10, 80 + 33*i);
                }
        }
        
        private void drawCard(Graphics g, Card card, int x, int y) {
        int cx; // top-left x of cardsImage
        int cy; // top-left y of cardsImage
        if (!card.isFaceUp()) {
         cx = 2*79;
         cy = 4*123;
        }
        else {
           cx = (card.getFace())*79;
           switch (card.getSuit()) {
                    case Card.DIAMONDS: cy = 123;       break;
                    case Card.CLUBS:    cy = 0;         break;              
                    case Card.HEARTS:   cy = 2*123;     break;
                    default:                    cy = 3*123;     break; //Spades
           }
        }
        g.drawImage(cardImgs,x,y,x+79,y+123,cx,cy,cx+79,cy+123,this);
        }       
}
