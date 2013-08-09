import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class GameFrame extends JFrame{

	private ImagePanel panel;
	private JPanel p1;
	private Player play;
	private Computer comp;
	private Deck dec;
	private int balance;
	private int userBet;
	private BetInput bet;
	public GameFrame(ImagePanel p, Player newPlay, Deck newDec, Computer newComp, int balance){
		setLayout(new BorderLayout());
		setSize(1200,700);
		this.setTitle("Blackjack");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		panel = p;
		play = newPlay;
		dec = newDec;
		comp = newComp;

		JButton hit = new JButton("Hit");
		JButton stand = new JButton("Stand");
		JButton surrender = new JButton("Surrender");
		JButton help = new JButton("Help");

		JLabel userBalance = new JLabel(" Your balance: $");

		JTextField balanceAmount = new JTextField(""+balance);


		hit.setToolTipText("Click this button to draw a card.");
		stand.setToolTipText("Click this button to end your turn.");
		surrender.setToolTipText("Click this button to end the round and split the pot.");
		help.setToolTipText("Click this button for game info.");
		userBalance.setToolTipText("The amount of money you have.");
		this.add(panel);
		p1 = new JPanel();
		p1.setPreferredSize(new Dimension(1200,100));
		p1.setLayout(null);
		p1.add(hit);
		p1.add(stand);
		p1.add(surrender);
		p1.add(help);
		p1.add(userBalance);
		p1.add(balanceAmount);
		p1.setBorder(new TitledBorder("User Panel"));
		bet = new BetInput(panel, play, dec, comp, balance);
		bet.Do();
		bet.setAlwaysOnTop(true);
		userBet = bet.getUserBet();
		balance -= userBet;
		
		Insets insets = p1.getInsets();

		Dimension size = hit.getPreferredSize();
		hit.setBounds(280 + insets.left, 25 + insets.top, size.width, size.height);//(horizontal, vertical, ..., ...)
		size = stand.getPreferredSize();
		stand.setBounds(330 + insets.left, 25 + insets.top,size.width, size.height);
		size = surrender.getPreferredSize();
		surrender.setBounds(398 + insets.left, 25 + insets.top, size.width, size.height);
		size = help.getPreferredSize();
		help.setBounds(800 + insets.left, 25 + insets.top, size.width, size.height);
		size = userBalance.getPreferredSize();
		userBalance.setBounds(507 + insets.left, 31 + insets.top, size.width, size.height);
		size = balanceAmount.getPreferredSize();
		balanceAmount.setBounds(600 + insets.left, 18 + insets.top,size.width + 20, size.height + 20);

		add(p1,BorderLayout.SOUTH);


		//this.setResizable(false);

		//register listeners
		HitListenerClass listener1 = new HitListenerClass();
		StandListenerClass listener2 = new StandListenerClass();
		SurrenderListenerClass listener3 = new SurrenderListenerClass();
		HelpListenerClass listener4 = new HelpListenerClass();
		hit.addActionListener(listener1);
		stand.addActionListener(listener2);
		surrender.addActionListener(listener3);
		help.addActionListener(listener4);

	}
	private class HitListenerClass implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			play.hit(dec);
			LoseWindow lose;
			if (play.getSum() > 21)
				lose = new LoseWindow(bet, play);
		}
	}
	class StandListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			WinWindow win;
			LoseWindow lose;
			/*if (comp.isPerfect())
				lose = new LoseWindow(bet,play);
			else if (play.isPerfect())
				win = new WinWindow(bet,play);*/
			if (!play.isHard()){
				{
				if (play.getSumHard() <= 11)
					play.setSum(play.getSum()+10);
				}
			}
			while (comp.getSum() < 17 && play.isDone())
			{
				comp.hit(dec);
				if (comp.getSum() <= 11 && !comp.isHard())
				{
					comp.setChanged(true);
					comp.setSum(comp.getSum()+10);
				}
				if (comp.getSum() > 11 && comp.isChanged())
				{
					comp.setChanged(false);
					comp.setSum(comp.getSum()-10);
				}
				if (comp.getSum() > 21)
					win = new WinWindow(bet,play);
			}
			comp.stand();
			panel.repaint();
			if (!comp.getWinner() && !play.getWinner() && !comp.isBust())
			{
				if (comp.getSum() >= play.getSum())
					lose = new LoseWindow(bet,play);
				else
					win = new WinWindow(bet,play);
			}
		}
	}

	class SurrenderListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			play.setSurrender(true);
			LoseWindow lose = new LoseWindow(bet, play);
		}		
	}
	class HelpListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			HelpButton helpFrame = new HelpButton();
		}	
	}


	//CODE TO UPDATE THE POT AND CURRENT BALANCE ON THE JPANEL

	/* Jframe frame = new JFrame(); 
	JPanel p = new JPanel(); 
	frame.add(p); 
	JLabel l1 = new JLabel("Text1"); 
	JLabel l2 = new JLabel("Text2"); 
	p.add(l1); p.add(l2); 
	frame.setVisible(true); 
	p.setVisible(true);

	 public void update(String message1, String message2) 
	 {
	  p.remove(l1); 
	  p.remove(l2); 
	  l1.setText(message1); 
	  l2.setText(message2); 
	  p.add(l1); 
	  p.add(l2); }
	 */

}

