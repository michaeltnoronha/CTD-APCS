import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WinWindow extends JFrame{
	private JPanel p1;
	private BetInput bets;
	private Player play;
	public WinWindow(BetInput b, Player p){
		bets = b;
		play = p;
		p1 = new JPanel();
		bets.setBal(bets.getBal() + bets.getUserBet());
		JLabel winText = new JLabel("You win! Your final balance is " + bets.getBal());
		p1.add(winText);
		JButton ok = new JButton("OK");
		p1.add(ok);
		this.setResizable(false);

		okListenerClass l1 = new okListenerClass();
		ok.addActionListener(l1);
		add(p1);
		this.setSize(350,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);

	}
	class okListenerClass implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			close();
		}
	}

	public void close()
	{
		this.dispose();
	}

}