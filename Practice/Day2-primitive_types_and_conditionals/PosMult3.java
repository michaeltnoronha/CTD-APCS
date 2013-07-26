import java.util.*;

public class PosMult3
{
    public static void man (String [] args) {
        Scanner keys = new Scanner(System.in);
        int input;

        System.out.print("Enter a number: ");
        input = keys.nextInt();

        if(input % 3 == 0 & input > 0)
        {
            System.out.println("Positive multiple of 3");
        }
        
        else
            System.out.println("Not a positive multiple of 3");
    }
}