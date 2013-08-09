import java.awt.Color;


//red_king.png, red_normal.png, black_king.png,black_normal.png
public class Piece extends ImagePanel {

	private boolean isKing;
	public Piece(String name, int x, int y, int W, int H, Color c) {
		super(name, x, y, W, H);
		setBackground(c);
		isKing=false;
	}
	
	public void king()
	{
		if(getName().equals("red_normal.png"))
		{
			setImage("red_king.png");
		}
		else if(getName().equals("black_normal.png"))
		{
			setImage("black_king.png");
		}
		isKing=true;
	}
	public boolean getIsKing()
	{
		return isKing;
	}
	
}
