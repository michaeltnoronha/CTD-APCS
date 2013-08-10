import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Board extends JFrame{
	private Space[][] spaces = new Space[8][8];
	private Color drawingColor= Color.red;
	private int turn;
	//Methods : isValidMove(Point x,point y) or (int x, int y)
	public Board()
	{
		turn=1;
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLocation(0,0);
		setSize(800,800);
		setResizable(false);
		setBackground(Color.BLUE);
		
		
		for(int i= 0;i< spaces.length;i++)
		{
			for(int j=0;j<spaces[0].length;j++)
			{
				spaces[j][i]=new Space((i*50)+200,(j*50)+200,drawingColor,this,i,j);
				if(j<=2)
				{
					if(spaces[j][i].getColor()==Color.red)
						spaces[j][i].addPiece("red_normal.png");
				}
				else if(j>=5)
				{	
					if(spaces[j][i].getColor()==Color.red)
						spaces[j][i].addPiece("black_normal.png");
					
				}
				System.out.print(spaces[j][i].isOccupied()+",");
				add(spaces[j][i]);
				changeColor();
			}
			System.out.println("");
			changeColor();
		}
		
		setVisible(true);
		spaces[0][0].getPiece().king();
	}
	
	public void changeColor()
	{
		if (drawingColor.equals(Color.darkGray))
			drawingColor=Color.red;
		else
			drawingColor=Color.darkGray;
	}
	
	public static void main(String args[])
	{
		new Board();
	}
	
	public boolean isValidMove(int y1 , int x1, int y2, int x2 )
	{
		if(spaces[y2][x2].isOccupied())
		{
			return false;
		}
		else if((x1+1==x2&&y1+1==y2))
		{
			return true;
		}
		else if(x1-1==x2&&y1+1==y2)
		{
			return true;
		}
		else if(spaces[(x1+1)][(y1+1)].isOccupied()&&x1+2==x2&&y1+2==y2)
		{
			return true;
		}
		else if(spaces[(int)(x1-1)][(int)(y1+1)].isOccupied()&&x1-2==x2&&y1+2==y2)
		{
			return true;
		}	
		return false;	
	}

	public Space[][] getSpaces() {
		// TODO Auto-generated method stub
		return spaces;
	}

}
