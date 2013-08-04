import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.*;

public class RainbowBug extends SquareBug
{
    public RainbowBug(){
        super(4);
        setColor(Color.GREEN);
    }

    public RainbowBug(int length){
        super(length);
        setColor(Color.GREEN);
    }

    public void act(){
        /*if(canMove() && getSteps() < getStepLength() - 1){
        move();
        setSteps(getSteps() + 1);
        }
        else{
        turn();
        turn();
        setSteps(0);*/
        super.act();
        int direction = getDirection();
        if(direction == Location.NORTH){
            setColor(Color.GREEN);
        }
        else if(direction == Location.EAST){
            setColor(Color.RED);
        }
        else if(direction == Location.SOUTH){
            setColor(Color.BLUE);
        }
        else{
            setColor(Color.YELLOW);
        }
    }

}

