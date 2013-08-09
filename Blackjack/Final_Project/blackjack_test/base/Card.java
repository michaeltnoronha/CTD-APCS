package blackjack_test.base;

public class Card {

    public static final int ACE = 0; 
    public static final int DEUCE = 1; 
    public static final int TWO = 1; 
    public static final int TRE = 2; 
    public static final int THREE = 2; 
    public static final int FOUR = 3; 
    public static final int FIVE = 4;
    public static final int SIX = 5; 
    public static final int SEVEN = 6;
    public static final int EIGHT = 7; 
    public static final int NINE = 8; 
    public static final int TEN = 9; 
    public static final int JACK = 10; 
    public static final int QUEEN = 11; 
    public static final int KING = 12; 
    public static final int DIAMONDS = 0; 
    public static final int CLUBS = 1; 
    public static final int HEARTS = 2; 
    public static final int SPADES = 3;
            
    private int suit; 
    private int face;
    private boolean isFaceUp;
    
    public Card(int cSuit, int cFace, boolean faceDir){
        suit = cSuit;
        face = cFace;
        isFaceUp = faceDir;
    }
    
    public Card(int cSuit, int cFace){
        suit = cSuit;
        face = cFace;
        isFaceUp = true;
    }
    
    public int getSuit(){
        return suit;
    }

    public String getColorName(){
        if(suit == 0 || suit == 2)
            return "Red";
        else
            return "Black";
    }
    
    public int getFace(){
        return face;
    }
    
    public int getValue(){
        if(face >= DEUCE && face <= TEN)
            return face;
        else if(face > TEN)
            return 10;
        return -1;
    }
    
    public int getHighValue() {
        int high = getValue();
        if (high == -1) {
                return 11;
        } else {
                return high;
        }
    }
    
    public int getLowValue() {
        int low = getValue();
        if (low == -1) {
                return 1;
        } else {
                return low;
        }
    }
    
    public void flip(){
        isFaceUp = !isFaceUp;
    }
    
    public boolean isFaceUp(){
        return isFaceUp;        
    }

    public String getSuitName(){
        switch(suit) {
            case DIAMONDS: return "Diamonds";
            case CLUBS: return "Clubs";
            case HEARTS: return "Hearts";
            case SPADES: return "Spades";
            default: return "Error: No Case";    
        }
    }

    public String getFaceName() {
        switch (face) {
            case ACE: return "Ace";
            case TWO: return "Two"; 
            case THREE: return "Three"; 
            case FOUR: return "Four"; 
            case FIVE: return "Five"; 
            case SIX: return "Six"; 
            case SEVEN: return "Seven"; 
            case EIGHT: return "Eight"; 
            case NINE: return "Nine";
            case TEN: return "Ten";
            case JACK: return "Jack"; 
            case QUEEN: return "Queen"; 
            case KING: return "King"; 
            default: return "Error: No Face";                 
        }
    }
}