import info.gridworld.actor.*;
import info.gridworld.grid.*;
public class GridDriver
{
    public static void main(String [] args){
        ActorWorld world = new ActorWorld();
        
        //world.add(new CTDRock());
        //world.add(new CTDBug());
        //world.add(new CTDBug());
        //world.add(new SquareBug(3));
		world.add(new RainbowBug(9));

        world.show();

		Actor a = new CTDBug(); //a CTDBug is actor
		a.act(); //This will run CTDBug's cersion of act
				 //This is called a dynamic binding of a late binding
				 //because the decision on what method to run is chosen
				 //at run time
    }
}