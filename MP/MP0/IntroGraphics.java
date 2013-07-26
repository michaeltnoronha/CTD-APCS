import javax.swing.*;
import java.awt.*;

public class IntroGraphics
{
    public static void main(String [] args)
    {
        int window_height = 600;  //this is the window's width
        int window_width  = 600;  //this is the window's height 
        
        JFrame myFrame = new JFrame("Test");
        JPanel thePanel = new JPanel();
        JLabel myLabel  = new JLabel("Output",JLabel.CENTER);
      
        thePanel.setLayout(new BorderLayout());
        thePanel.add(myLabel,BorderLayout.CENTER);
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().setLayout(new BorderLayout());
        myFrame.getContentPane().add(thePanel,BorderLayout.CENTER);
        myFrame.setSize(window_width,window_height);     //this actually sets the windows size as we defined it above 
        myFrame.setVisible(true);                       //make the window visible   
    }
}

/*
 * The import javax.swing.* imports classes from some external source,
 * so that classes used when the code is compiled and run do not
 * return errors or have to be defined multiple times.
 */
