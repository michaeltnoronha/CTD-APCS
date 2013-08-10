import javax.swing.*;

public class blackjack_driver
{
    public static void main(String[] args) {	
        JFrame frame = new JFrame("Blackjack");

        add(Cards.getCard1());

        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}