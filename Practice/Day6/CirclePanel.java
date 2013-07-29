import javax.swing.*;
import java.awt.*;

public class CirclePanel extends JPanel
{
    private Circle myCircle;

    public CirclePanel(){
        myCircle = new Circle(); //calling Circle's default constructor
    }

    public Circle getCircle(){
        return myCircle;
    }

    public void setmyCircle(Circle newCircle){
        if(newCircle != null){
            myCircle = newCircle;
        }    
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);  //redraws the background
        myCircle.draw(g);
    }

}