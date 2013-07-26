import java.util.*;

public class PosNegZero {
    public static void main (String [] args) {
        int input;
        Scanner keys = new Scanner(System.in);

        System.out.print("Enter a number: ");
        input = keys.nextInt();
        
        if (input > 0)
            System.out.print("Positive");
        else if (input < 0)
            System.out.print ("Negative");
        else
            System.out.print ("Zero");
    }
}   