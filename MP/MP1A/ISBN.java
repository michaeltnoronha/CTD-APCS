import java.util.*;

public class ISBN{
    public static void main (String [] args) {
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;
        int digit6;
        int digit7;
        int digit8;
        int digit9;
        int checksum;
        
        Scanner keys =  new Scanner(System.in);

        System.out.print("Enter the lst 9 ISBN digits seperated by a space: " );
        digit1 = keys.nextInt();
        digit2 = keys.nextInt();
        digit3 = keys.nextInt();
        digit4 = keys.nextInt();
        digit5 = keys.nextInt();
        digit6 = keys.nextInt();
        digit7 = keys.nextInt();
        digit8 = keys.nextInt();
        digit9 = keys.nextInt();
        
        checksum = (((digit1 * 1)+ (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6) + (digit7 * 7) + (digit8 *8) + (digit9 * 9))%11);
        
        System.out.println("Here is the complete ISBN number: ");
        System.out.printf("%d%d%d%d%d%d%d%d%d%d",digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, checksum);
    }
}
