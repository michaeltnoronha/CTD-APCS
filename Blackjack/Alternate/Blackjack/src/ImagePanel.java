import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
	private Player player;
	private Computer computer;
	private Deck deck;
	private ImageIcon back = new ImageIcon(getClass().getResource("cards/back.png"));
	private ImageIcon c1 = new ImageIcon(getClass().getResource("cards/c-1.png"));
	private ImageIcon c2 = new ImageIcon(getClass().getResource("cards/c-2.png"));
	private ImageIcon c3 = new ImageIcon(getClass().getResource("cards/c-3.png"));
	private ImageIcon c4 = new ImageIcon(getClass().getResource("cards/c-4.png"));
	private ImageIcon c5 = new ImageIcon(getClass().getResource("cards/c-5.png"));
	private ImageIcon c6 = new ImageIcon(getClass().getResource("cards/c-6.png"));
	private ImageIcon c7 = new ImageIcon(getClass().getResource("cards/c-7.png"));
	private ImageIcon c8 = new ImageIcon(getClass().getResource("cards/c-8.png"));
	private ImageIcon c9 = new ImageIcon(getClass().getResource("cards/c-9.png"));
	private ImageIcon c10 = new ImageIcon(getClass().getResource("cards/c-10.png"));
	private ImageIcon c11 = new ImageIcon(getClass().getResource("cards/c-11.png"));
	private ImageIcon c12 = new ImageIcon(getClass().getResource("cards/c-12.png"));
	private ImageIcon c13 = new ImageIcon(getClass().getResource("cards/c-13.png"));
	private ImageIcon d1 = new ImageIcon(getClass().getResource("cards/d-1.png"));
	private ImageIcon d2 = new ImageIcon(getClass().getResource("cards/d-2.png"));
	private ImageIcon d3 = new ImageIcon(getClass().getResource("cards/d-3.png"));
	private ImageIcon d4 = new ImageIcon(getClass().getResource("cards/d-4.png"));
	private ImageIcon d5 = new ImageIcon(getClass().getResource("cards/d-5.png"));
	private ImageIcon d6 = new ImageIcon(getClass().getResource("cards/d-6.png"));
	private ImageIcon d7 = new ImageIcon(getClass().getResource("cards/d-7.png"));
	private ImageIcon d8 = new ImageIcon(getClass().getResource("cards/d-8.png"));
	private ImageIcon d9 = new ImageIcon(getClass().getResource("cards/d-9.png"));
	private ImageIcon d10 = new ImageIcon(getClass().getResource("cards/d-10.png"));
	private ImageIcon d11 = new ImageIcon(getClass().getResource("cards/d-11.png"));
	private ImageIcon d12 = new ImageIcon(getClass().getResource("cards/d-12.png"));
	private ImageIcon d13 = new ImageIcon(getClass().getResource("cards/d-13.png"));
	private ImageIcon h1 = new ImageIcon(getClass().getResource("cards/h-1.png"));
	private ImageIcon h2 = new ImageIcon(getClass().getResource("cards/h-2.png"));
	private ImageIcon h3 = new ImageIcon(getClass().getResource("cards/h-3.png"));
	private ImageIcon h4 = new ImageIcon(getClass().getResource("cards/h-4.png"));
	private ImageIcon h5 = new ImageIcon(getClass().getResource("cards/h-5.png"));
	private ImageIcon h6 = new ImageIcon(getClass().getResource("cards/h-6.png"));
	private ImageIcon h7 = new ImageIcon(getClass().getResource("cards/h-7.png"));
	private ImageIcon h8 = new ImageIcon(getClass().getResource("cards/h-8.png"));
	private ImageIcon h9 = new ImageIcon(getClass().getResource("cards/h-9.png"));
	private ImageIcon h10 = new ImageIcon(getClass().getResource("cards/h-10.png"));
	private ImageIcon h11 = new ImageIcon(getClass().getResource("cards/h-11.png"));
	private ImageIcon h12 = new ImageIcon(getClass().getResource("cards/h-12.png"));
	private ImageIcon h13 = new ImageIcon(getClass().getResource("cards/h-13.png"));
	private ImageIcon s1 = new ImageIcon(getClass().getResource("cards/s-1.png"));
	private ImageIcon s2 = new ImageIcon(getClass().getResource("cards/s-2.png"));
	private ImageIcon s3 = new ImageIcon(getClass().getResource("cards/s-3.png"));
	private ImageIcon s4 = new ImageIcon(getClass().getResource("cards/s-4.png"));
	private ImageIcon s5 = new ImageIcon(getClass().getResource("cards/s-5.png"));
	private ImageIcon s6 = new ImageIcon(getClass().getResource("cards/s-6.png"));
	private ImageIcon s7 = new ImageIcon(getClass().getResource("cards/s-7.png"));
	private ImageIcon s8 = new ImageIcon(getClass().getResource("cards/s-8.png"));
	private ImageIcon s9 = new ImageIcon(getClass().getResource("cards/s-9.png"));
	private ImageIcon s10 = new ImageIcon(getClass().getResource("cards/s-10.png"));
	private ImageIcon s11 = new ImageIcon(getClass().getResource("cards/s-11.png"));
	private ImageIcon s12 = new ImageIcon(getClass().getResource("cards/s-12.png"));
	private ImageIcon s13 = new ImageIcon(getClass().getResource("cards/s-13.png"));
	private Image cardback = back.getImage();
	private Image clubs1 = c1.getImage();
	private Image clubs2 = c2.getImage();
	private Image clubs3 = c3.getImage();
	private Image clubs4 = c4.getImage();
	private Image clubs5 = c5.getImage();
	private Image clubs6 = c6.getImage();
	private Image clubs7 = c7.getImage();
	private Image clubs8 = c8.getImage();
	private Image clubs9 = c9.getImage();
	private Image clubs10 = c10.getImage();
	private Image clubs11 = c11.getImage();
	private Image clubs12 = c12.getImage();
	private Image clubs13 = c13.getImage();
	private Image diamonds1 = d1.getImage();
	private Image diamonds2 = d2.getImage();
	private Image diamonds3 = d3.getImage();
	private Image diamonds4 = d4.getImage();
	private Image diamonds5 = d5.getImage();
	private Image diamonds6 = d6.getImage();
	private Image diamonds7 = d7.getImage();
	private Image diamonds8 = d8.getImage();
	private Image diamonds9 = d9.getImage();
	private Image diamonds10 = d10.getImage();
	private Image diamonds11 = d11.getImage();
	private Image diamonds12 = d12.getImage();
	private Image diamonds13 = d13.getImage();
	private Image hearts1 = h1.getImage();
	private Image hearts2 = h2.getImage();
	private Image hearts3 = h3.getImage();
	private Image hearts4 = h4.getImage();
	private Image hearts5 = h5.getImage();
	private Image hearts6 = h6.getImage();
	private Image hearts7 = h7.getImage();
	private Image hearts8 = h8.getImage();
	private Image hearts9 = h9.getImage();
	private Image hearts10 = h10.getImage();
	private Image hearts11 = h11.getImage();
	private Image hearts12 = h12.getImage();
	private Image hearts13 = h13.getImage();
	private Image spades1 = s1.getImage();
	private Image spades2 = s2.getImage();
	private Image spades3 = s3.getImage();
	private Image spades4 = s4.getImage();
	private Image spades5 = s5.getImage();
	private Image spades6 = s6.getImage();
	private Image spades7 = s7.getImage();
	private Image spades8 = s8.getImage();
	private Image spades9 = s9.getImage();
	private Image spades10 = s10.getImage();
	private Image spades11 = s11.getImage();
	private Image spades12 = s12.getImage();
	private Image spades13 = s13.getImage();

	public ImagePanel(Player p, Computer c, Deck d){
		this.setPreferredSize(new Dimension(500,500));
		player = p;
		computer = c;
		deck = d;
	}

	public Image convert(Card drawn)
	{
		if (drawn.getIndex() == 0 || drawn.getIndex() == 52)
			return clubs1;
		else if (drawn.getIndex() == 1 || drawn.getIndex() == 53)
			return clubs2;
		else if (drawn.getIndex() == 2 || drawn.getIndex() == 54)
			return clubs3;
		else if (drawn.getIndex() == 3 || drawn.getIndex() == 55)
			return clubs4;
		else if (drawn.getIndex() == 4 || drawn.getIndex() == 56)
			return clubs5;
		else if (drawn.getIndex() == 5 || drawn.getIndex() == 57)
			return clubs6;
		else if (drawn.getIndex() == 6 || drawn.getIndex() == 58)
			return clubs7;
		else if (drawn.getIndex() == 7 || drawn.getIndex() == 59)
			return clubs8;
		else if (drawn.getIndex() == 8 || drawn.getIndex() == 60)
			return clubs9;
		else if (drawn.getIndex() == 9 || drawn.getIndex() == 61)
			return clubs10;
		else if (drawn.getIndex() == 10 || drawn.getIndex() == 62)
			return clubs11;
		else if (drawn.getIndex() == 11 || drawn.getIndex() == 63)
			return clubs12;
		else if (drawn.getIndex() == 12 || drawn.getIndex() == 64)
			return clubs13;
		else if (drawn.getIndex() == 13 || drawn.getIndex() == 65)
			return diamonds1;
		else if (drawn.getIndex() == 14 || drawn.getIndex() == 66)
			return diamonds2;
		else if (drawn.getIndex() == 15 || drawn.getIndex() == 67)
			return diamonds3;
		else if (drawn.getIndex() == 16 || drawn.getIndex() == 68)
			return diamonds4;
		else if (drawn.getIndex() == 17 || drawn.getIndex() == 69)
			return diamonds5;
		else if (drawn.getIndex() == 18 || drawn.getIndex() == 70)
			return diamonds6;
		else if (drawn.getIndex() == 19 || drawn.getIndex() == 71)
			return diamonds7;
		else if (drawn.getIndex() == 20 || drawn.getIndex() == 72)
			return diamonds8;
		else if (drawn.getIndex() == 21 || drawn.getIndex() == 73)
			return diamonds9;
		else if (drawn.getIndex() == 22 || drawn.getIndex() == 74)
			return diamonds10;
		else if (drawn.getIndex() == 23 || drawn.getIndex() == 75)
			return diamonds11;
		else if (drawn.getIndex() == 24 || drawn.getIndex() == 76)
			return diamonds12;
		else if (drawn.getIndex() == 25 || drawn.getIndex() == 77)
			return diamonds13;
		else if (drawn.getIndex() == 26 || drawn.getIndex() == 78)
			return hearts1;
		else if (drawn.getIndex() == 27 || drawn.getIndex() == 79)
			return hearts2;
		else if (drawn.getIndex() == 28 || drawn.getIndex() == 80)
			return hearts3;
		else if (drawn.getIndex() == 29 || drawn.getIndex() == 81)
			return hearts4;
		else if (drawn.getIndex() == 30 || drawn.getIndex() == 82)
			return hearts5;
		else if (drawn.getIndex() == 31 || drawn.getIndex() == 83)
			return hearts6;
		else if (drawn.getIndex() == 32 || drawn.getIndex() == 84)
			return hearts7;
		else if (drawn.getIndex() == 33 || drawn.getIndex() == 85)
			return hearts8;
		else if (drawn.getIndex() == 34 || drawn.getIndex() == 86)
			return hearts9;
		else if (drawn.getIndex() == 35 || drawn.getIndex() == 87)
			return hearts10;
		else if (drawn.getIndex() == 36 || drawn.getIndex() == 88)
			return hearts11;
		else if (drawn.getIndex() == 37 || drawn.getIndex() == 89)
			return hearts12;
		else if (drawn.getIndex() == 38 || drawn.getIndex() == 90)
			return hearts13;
		else if (drawn.getIndex() == 39 || drawn.getIndex() == 91)
			return spades1;
		else if (drawn.getIndex() == 40 || drawn.getIndex() == 92)
			return spades2;
		else if (drawn.getIndex() == 41 || drawn.getIndex() == 93)
			return spades3;
		else if (drawn.getIndex() == 42 || drawn.getIndex() == 94)
			return spades4;
		else if (drawn.getIndex() == 43 || drawn.getIndex() == 95)
			return spades5;
		else if (drawn.getIndex() == 44 || drawn.getIndex() == 96)
			return spades6;
		else if (drawn.getIndex() == 45 || drawn.getIndex() == 97)
			return spades7;
		else if (drawn.getIndex() == 46 || drawn.getIndex() == 98)
			return spades8;
		else if (drawn.getIndex() == 47 || drawn.getIndex() == 99)
			return spades9;
		else if (drawn.getIndex() == 48 || drawn.getIndex() == 100)
			return spades10;
		else if (drawn.getIndex() == 49 || drawn.getIndex() == 101)
			return spades11;
		else if (drawn.getIndex() == 50 || drawn.getIndex() == 102)
			return spades12;
		else
			return spades13;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (player.isHit())
		{
			for (int i = 0; i < player.getCount(); i++)
				g.drawImage(convert(player.getHand().getDeck().get(i)), 79*i, getHeight()-123, 79, 123, this);
		}

		if (computer.isHit() && !computer.isDone())
		{
			g.drawImage(convert(computer.getHand().getDeck().get(0)), 0, 0, 79, 123, this);
			for (int i = 1; i < computer.getCount(); i++)
				g.drawImage(cardback, 79*i, 0, 79, 123, this);
		}
		
		if (computer.isHit() && computer.isDone())
		{
			for (int i = 0; i < computer.getCount(); i++)
				g.drawImage(convert(computer.getHand().getDeck().get(i)), 79*i, 0, 79, 123, this);
		}
	}

}
