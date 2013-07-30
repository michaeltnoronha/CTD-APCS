import info.gridworld.actor.*;

public class OurFirstGridWorldProject
{
    public static void main (String [] args){
        
        ActorWorld world = new ActorWorld();
        Actor myActor = new Actor();
        Bug myBug = new Bug();
        Rock myRock = new Rock();
        
        world.add(myBug);
        world.add(myActor);
        world.add(myRock);
        world.show();
        
    }
}