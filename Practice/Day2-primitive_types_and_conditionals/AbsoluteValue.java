import java.util.*;

public class AbsoluteValue {
    public static void main (String [] args) {
        Scanner keys = new Scanner(System.in);
        double input, abs_value;
        
        System.out.print("Enter a number: ");
        input = keys.nextDouble();
        
        if (input <0) //NO SEMICOLON
            abs_value = -1 * input;
        else
            abs_value = input;
            
        System.out.print("|"+input+"| = " + abs_value);
    }
    
    /*
     * Or:
     * 
     * abs_value = input;
     * if (input<0)
     *     abs_value = -1 * input;
     */
}