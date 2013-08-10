import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Image;
import javax.swing.JLabel;

public class BlackjackClient extends JFrame{

    private ArrayList<Cards> cards = new ArrayList<Cards>();
    private JTextField jtfTry = new JTextField("Enter a Solution:");
    private JButton jbtRefresh = new JButton("Refresh");
    private JButton jbtSolution = new JButton("Receive cards");
    private JButton jbtVerify = new JButton("Verify");
    private Cards view = new Cards();

    @Override
    public void init() {

        JPanel panel = new JPanel();

        this.add(panel, BorderLayout.CENTER);
        this.add(jbtRefresh, BorderLayout.NORTH);
        this.add(jbtSolution, BorderLayout.NORTH);
        this.add(jbtVerify, BorderLayout.SOUTH);
        this.add(jtfTry, BorderLayout.SOUTH);

        jbtRefresh.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });

        jbtSolution.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
        jbtVerify.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
        jtfTry.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });

    }

    public class Cards extends JPanel {
        int card = (int) (Math.floor(Math.random() * 51) + 1);

        Image card1 = new ImageIcon("cards.png").getImage();
        Image card2 = new ImageIcon("" + card + ".png").getImage();
        Image card3 = new ImageIcon("" + card + ".png").getImage();
        Image card4 = new ImageIcon("" + card + ".png").getImage();
        Image card5 = new ImageIcon("" + card + ".png").getImage();
        Image card6 = new ImageIcon("" + card + ".png").getImage();
        Image card7 = new ImageIcon("" + card + ".png").getImage();
        Image card8 = new ImageIcon("" + card + ".png").getImage();
        Image card9 = new ImageIcon("" + card + ".png").getImage();
        Image card10 = new ImageIcon("" + card + ".png").getImage();
        Image card11 = new ImageIcon("" + card + ".png").getImage();
        Image card12 = new ImageIcon("" + card + ".png").getImage();
        Image card13 = new ImageIcon("" + card + ".png").getImage();

        // Constructors
        public Cards(){
            setLayout(new GridLayout(1, 13, 2, 2));
            add(new JLabel());
            add(new JLabel());
            add(new JLabel());
            add(new JLabel());
        }

        public Image getCard1(){
            return card1;
        }
    }

}
