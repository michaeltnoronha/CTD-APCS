import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoseWindow extends JFrame{
	private BetInput bets;
	private JPanel p1;
	private Player play;
	public LoseWindow(BetInput b, Player p){
		bets = b;
		play = p;
		p1 = new JPanel();
		if (!play.isSurrender())
			bets.setBal(bets.getBal() - bets.getUserBet());
		else
			bets.setBal(bets.getBal() - bets.getUserBet()/2);
		JLabel loseText = new JLabel("You lose! Your final balance is " + bets.getBal());
		JButton ok = new JButton("OK");
		this.setResizable(false);

		p1.add(loseText);
		p1.add(ok);

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





