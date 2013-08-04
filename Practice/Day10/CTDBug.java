import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.*;

public class CTDBug extends Actor{

    public CTDBug(){
        super();
        this.setColor(Color.GREEN);
    }

    public CTDBug(Color c){
        super();
        this.setColor(c);
    }

    public void turn(){
        int current_direction = this.getDirection();
        int new_direction = current_direction + Location.HALF_RIGHT;
        this.setDirection(new_direction);
    }

    //returns true if the bug can move forward
    public boolean canMove(){
        Grid<Actor> gr = getGrid();
        if(gr == null){
            return false;
        }

        Location current = getLocation();
        int current_direction = getDirection();
        Location next = current.getAdjacentLocation(current_direction);

        if(!gr.isValid(next)){
            return false;
        }

        Actor enemy = gr.get(next); //enemy is null if actor is currently
        //at the next spot
        return enemy == null || enemy instanceof Flower;
    }

    public void move(){
        Grid<Actor> gr = getGrid();

        if(gr == null){
            return ;  //stops the method and returns nothing
        }

        Location current = getLocation();
        Location next = current.getAdjacentLocation(getDirection());

        if(!gr.isValid(next)){
            this.removeSelfFromGrid();
        }
        else{
            Flower f = new Flower(getColor());
            moveTo(next);
            f.putSelfInGrid(gr, current);
        }
    }
    
    //we are overriding the act method inherited from Actor
    public void act(){
        if(canMove()){
            move();
        }
        else{
            turn();
        }
    }
}