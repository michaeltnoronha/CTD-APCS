import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.*;

public class CTDRock extends Actor{
    
    //color
    //grid
    //location
    //direction
    
    public CTDRock(){
        //this.color = Color.GREEN;
        super(); //This will call the default constructor of the parent class
        
        this.setColor(Color.BLACK);
    }
    
    
    //we are redefining how act works. This is called method overriding, not overloading
    //Overriding ==> exact same method signature
    //Overloading ==> return type is the same but parameters change
    public void act(){
        
    }
}