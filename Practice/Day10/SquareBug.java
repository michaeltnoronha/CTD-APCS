import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.*;

public class SquareBug extends Bug{
    private int stepLength;
    private int steps;

    public SquareBug(int length){
        //super();
        setColor(Color.YELLOW);
        stepLength = length+3;
        steps = 0;

    }

    public void act(){
        if(canMove() && steps < stepLength - 1){
            move();
            steps++;
        }
        else{
            turn();
            turn();
            steps = 0;
        }
    }

    public int getStepLength(){
        return stepLength;
    }

    public int getSteps(){
        return steps;
    }

    public void setStepLength(int newStepLength){
		stepLength = newStepLength;
    }

    public void setSteps(int newSteps){
		steps = newSteps;
    }
}