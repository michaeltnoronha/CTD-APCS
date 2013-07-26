import java.util.*;

public class input_practice{
    public static void main (String [] args) {
        int input;
        Scanner keys =  new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        input = keys.nextInt();
        System.out.printf ("You entered: %d", input); 
    }
}
