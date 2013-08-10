import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class Space extends JPanel implements MouseListener{
	
	private Board gameBoard;
	private Piece piece;
	private Color color;
	private boolean occupied;
	private int locationx;
	private int locationy;
	private boolean isClicked;
	
	//red_king.png, red_normal.png, black_king.png,black_normal.png
	
	
	public Space(int x, int y,Color c,Board b,int gridLocationx,int gridLocationy)
	{
		//add(new Piece("red_king.png",5,5,40,40,c));
		locationx = gridLocationx;
		locationy=gridLocationy;
		gameBoard=b;
		color=c;
		occupied=false;
		setBackground(c);
		this.setLayout(null);
		setSize(50,50);
		setLocation(x,y);
		this.addMouseListener(this);
		setVisible(true);			
	}
	public boolean isOccupied()
	{
		return occupied;
	}
	public void add(Piece p)
	{
		piece=p;
		super.add(p);
		repaint();
		occupied=true;
	}
	public void addPiece(String file)
	{
		piece= new Piece(file, 5,5,40,40,color);
		add(piece);
		occupied= true;
	}
	
	public void removePiece()
	{
		if(piece!=null&&occupied)
		{
			remove(piece);
			piece=null;
			occupied=false;
		}
	}
	public Piece getPiece()
	{
		return piece;
	}
	
	
	
	
	public void mouseClicked(MouseEvent arg0) 
	{
		System.out.print("mouse clicked");
		boolean clicked = false;
		gameBoard.getSpaces();
		int x = -1, y = -1;
	
		for(int i = 0; i < 8; i++){
			for(int k = 0; k < 8; k++){
					if(gameBoard.getSpaces()[i][k].isClicked()){
						clicked = true;
						x = i;
						y = k;
					}
			}
		}
		if(clicked){
			goTo(x, y);
			gameBoard.getSpaces()[x][y].setClicked(false);
			gameBoard.getSpaces()[x][y].setBackground(color);
		}
			else
			{
				isClicked = true;
				setBackground(Color.YELLOW);
			}
	}
	public void goTo(int x, int y){
		System.out.println(gameBoard.isValidMove(x,y,locationx,locationy));
		if(gameBoard.isValidMove(x,y,locationx,locationy)){
			System.out.print("in if");
			addPiece(gameBoard.getSpaces()[x][y].getPiece().getName());
			gameBoard.getSpaces()[x][y].removePiece();
			
		}
	}
	


	public void mouseEntered(MouseEvent arg0) {
		
		
	}


	public void mouseExited(MouseEvent arg0) {
		
		
	}

	
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	public void mouseReleased(MouseEvent arg0) {
		
		
	}
	public boolean isClicked()
	{
		return isClicked;
	}
	public void setClicked(boolean b)
	{
		isClicked= b;
	}
	public Color getColor()
	{
		return color;
	}
	

}
