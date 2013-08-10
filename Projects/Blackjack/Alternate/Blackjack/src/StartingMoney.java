import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class StartingMoney extends JFrame{

	private JTextField startMoney= new JTextField();
	private GameFrame frame;
	private JButton submitMoney = new JButton("Submit");
	private ImagePanel panel;
	private Player play;
	private Deck deck;
	private Computer deal;
	public StartingMoney(ImagePanel pan, Player p, Deck d, Computer c){
		panel = pan;
		play = p;
		deck = d;
		deal = c;
		JPanel p1 = new JPanel(new GridLayout(1,2));
		p1.add(new JLabel("Enter the amount of money you want to start with: "));
		p1.add(startMoney);
		p1.add(submitMoney);
		p1.setBorder(new TitledBorder("Starting Money"));

		add(p1, BorderLayout.CENTER);
		
		this.pack();
		this.setTitle("Blackjack");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		submitMoney.addActionListener(new ButtonListener());
	}



	public JTextField getStartMoney(){
		return startMoney;


	}

	
	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			close();

			
		}

	}

	public void close(){
		//Get values from text fields
		int startUserBalance = Integer.parseInt(getStartMoney().getText());
		//System.out.println(startUserBalance);	
		frame = new GameFrame(panel,play,deck,deal,startUserBalance);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		this.dispose();
	}



}
