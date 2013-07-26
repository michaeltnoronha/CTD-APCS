import java.util.*;

public class MoonInput {
    public static void main (String [] args) {
        double earth_weight, moon_weight;
        Scanner keys = new Scanner(System.in);
        String name;
        
        System.out.print("Enter your name: ");
        name = keys.next();  //Reads in a String

        System.out.print("Enter your weight in pounds: ");
        earth_weight = keys.nextDouble();
        moon_weight = earth_weight / 6;
        System.out.printf("%s weight on the moon is %f pounds",name,moon_weight);
    }
}