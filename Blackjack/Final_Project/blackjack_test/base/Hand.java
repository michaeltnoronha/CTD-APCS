package blackjack_test.base;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> playerHand = new ArrayList<Card>();

    public final static int INITIAL_HAND_SIZE = 2;
    public final static int BLACKJACK_VALUE = 21;

    public Hand(Card card1, Card card2){
        playerHand.add(card1);
        playerHand.add(card2);
    }

      
    public void addCard(Card toAdd){
        playerHand.add(toAdd);
    }
    
    public Card get(int index) {
        return playerHand.get(index);
    }

    public int length(){
        return playerHand.size();
    }

    public int getBestValue() {
        int totalValue = 0;
        for(Card c: playerHand) {
                if (c.getFace() != Card.ACE) {
                        totalValue += c.getValue();
                }
        }
        for(Card c: playerHand) {
                if (c.getFace() == Card.ACE) {
                        if (totalValue + c.getHighValue() <= 21) {
                                totalValue += c.getHighValue();
                        } else {
                                totalValue += c.getLowValue(); //1
                        }    
                }
        }
        return totalValue;
    }
    
    public boolean isBusted(){
        return getBestValue() > 21;
    }
    
    public boolean isBlackJack(){
        boolean hasAce = false;
        boolean hasTen = false;
        for (int i = 0; i < INITIAL_HAND_SIZE; i++) {
                if (playerHand.get(i).getFace() == Card.ACE) 
                        hasAce = true;
                if (playerHand.get(i).getValue() == 10)
                        hasTen = true;
        }
        return hasAce && hasTen;
    }

    public ArrayList<Card> clearHand(){
        ArrayList<Card> remove = new ArrayList<Card>();
        for(int i = 0; i < playerHand.size(); i++){
            remove.add(playerHand.get(i));
        }
        playerHand.clear();
        return remove;
    }
}