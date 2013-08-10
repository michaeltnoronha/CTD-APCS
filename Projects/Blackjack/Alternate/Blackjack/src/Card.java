
public class Card {
	private int value;
	private int index; //  determines individual card

	public Card(int v, int ind)
	{
		value = v;
		index = ind;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getValue() {
		if (value > 10) // face
			return 10;
		else
			return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFace() {
		if (value>10)
			return true;
		else
			return false;
	}

}