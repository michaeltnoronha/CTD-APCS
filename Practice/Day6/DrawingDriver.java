import javax.swing.*;

public class DrawingDriver
{
    public static void main (String [] args){
        JFrame frame = new JFrame("This is the window title!");
        CirclePanel pan = new CirclePanel();
        
        frame.setSize(1000,1000);
        frame.add(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}