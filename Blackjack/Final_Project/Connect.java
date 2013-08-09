import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Connect extends JFrame 
{
    public Connect(){
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Port address: "));
        add(new JTextField(8));
    }
    
    public static void main (String[] args){
        Connect frame = new Connect();
        frame.setTitle("Connect to server");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
