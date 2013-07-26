import java.util.*;

public class PtsInTriangle{
    public static void main (String [] args) {
        int x;
        int y;
        Scanner keys =  new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        x = keys.nextInt();
        System.out.print("Enter y coordinate: ");
        y = keys.nextInt();
        System.out.printf ("You entered the coordinate: (%d,%d)",x,y);

        if(y<=-0.5*x+100 & x>0 & y>0)
        {
            System.out.println("\nThe point you have entered is within the given triangle!");
        }
        
        //else if(x<200 | y<100)
        //{
        //    System.out.println("\nThe point you have entered is NOT within the given triangle!");
        //}
        
        else
        {
            System.out.println("\nThe point you have entered is NOT within the given triangle!");
        } 

    }
}
