import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CirclePanel extends JPanel implements ActionListener
{
    private Circle myCircle;
    private JButton myButton;

    public CirclePanel(){
        myCircle = new Circle(); //calling Circle's default constructor
        myButton = new JButton("Click me!");
        myButton.addActionListener(this);
        add(myButton);
    }

    public Circle getCircle(){
        return myCircle;
    }

    public void setmyCircle(Circle newCircle){
        if(newCircle != null){
            myCircle = newCircle;
        }    
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == myButton){
            myCircle.setRadius(myCircle.getRadius() + 10);
        }
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);  //redraws the background
        myCircle.draw(g);
    }

}