import java.util.*;
public class Player {
	private boolean winner;
	private Deck hand;
	private int sum;
	private boolean hit;
	private boolean bust;
	private boolean hard;
	private Card drawn;
	private ImagePanel panel;
	private int count;
	private boolean done;
	private boolean surrender;
	private int sumHard; 

	public Player(){
		winner = false;
		hand = new Deck();
		sum = 0;
		hit = false;
		bust = false;
		hard = true;
		count = 0;
		done = false;
		surrender = false;
		sumHard = 0;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public boolean isHard() {
		for (int i = 0; i<hand.getDeck().size(); i++)
		{
			if (hand.getDeck().get(i).getValue() == 1)
				hard = false;
		}
		return hard;
	}

	public void setHard(boolean hard) {
		this.hard = hard;
	}

	public boolean isBust() {
		if (sum > 21)
			bust = true;
		return bust;
	}

	public void setBust(boolean bust) {
		this.bust = bust;
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean getWinner(){
		return winner;
	}

	public void setWinner(boolean newWinner){
		winner = newWinner;
	}

	public Deck getHand() {
		return hand;
	}

	public void setHand(Deck hand) {
		this.hand = hand;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Card getDrawn() {
		return drawn;
	}

	public void setDrawn(Card drawn) {
		this.drawn = drawn;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ImagePanel getPanel() {
		return panel;
	}

	public void setPanel(ImagePanel p){
		panel = p;
	}

	public boolean isSurrender() {
		return surrender;
	}

	public void setSurrender(boolean surrender) {
		this.surrender = surrender;
	}

	public void hit(Deck deck)
	{
		if (!isBust())
		{
			hit = true;
			drawn = deck.draw();
			hand.getDeck().add(drawn);
			sum += drawn.getValue();
			count++;
		}
		panel.repaint();
	}

	public boolean isPerfect()
	{
		if((hand.getDeck().get(0).getValue() == 1) && (hand.getDeck().get(1).isFace()))
			return true;
		else if(((hand.getDeck().get(0).isFace()) && (hand.getDeck().get(1).getValue() == 1)))
			return true;
		else
			return false;
	}

	public void stand()
	{
		done = true;
	}

	public void win()
	{
		winner = true;
	}

	public void lose()
	{
		winner = false;
	}
	
	public int getSumHard()
	{
		for (int i = 0; i < hand.getDeck().size(); i++)
		{
			if (hand.getDeck().get(i).getValue() != 1)
				sumHard += hand.getDeck().get(i).getValue();
		}
		return sumHard;
	}

}
