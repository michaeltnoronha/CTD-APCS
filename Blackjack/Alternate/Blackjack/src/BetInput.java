import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;



public class BetInput extends JFrame{

	private JLabel label;
	private JTextField bet = new JTextField();
	private JButton submit = new JButton("Submit");
	private GameFrame frame;
	private ImagePanel panel;
	private Player play;
	private Deck deck;
	private Computer deal;
	private int startUserBet;
	private int bal;
	private int minBet;
	public BetInput(ImagePanel pan, Player p, Deck d, Computer c, int balance){
		panel = pan;
		play = p;
		deck = d;
		deal = c;
		bal = balance;
		minBet = (int)(0.05*bal);
	}
	public void Do()	
		{
		label = new JLabel("Please enter your bet. The minimum bet is " + minBet + ". ");
		
		JPanel p1 = new JPanel(new GridLayout(1,2));
		p1.add(label);
		p1.add(bet);
		p1.add(submit);
		p1.setBorder(new TitledBorder("Bet"));

		add(p1, BorderLayout.CENTER);

		this.pack();//sizes frame based on components
		this.setTitle("Blackjack");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

		submit.addActionListener(new ButtonListener());
	}

	public JTextField getStartBet(){
		return bet;
	}


	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			close();				
		}
	}

	public void close(){
		//Get values from text fields
		startUserBet = Integer.parseInt(getStartBet().getText());
		
		if (isValid())
			this.dispose();
		else
			startUserBet = Integer.parseInt(getStartBet().getText());
	}
	
	public int getUserBet()
	{
		return startUserBet;
	}
	
	public void setUserBet(int newUserBet)
	{
		startUserBet = newUserBet;
	}
	
	
	public int getBal()
	{
		return bal;
	}
	
	public void setBal(int newBal)
	{
		bal = newBal;
	}
	
	public boolean isValid(){
		if(startUserBet > bal)
			return false;
		else if(startUserBet < minBet)
			return false;
		else
			return true;
	}
}

