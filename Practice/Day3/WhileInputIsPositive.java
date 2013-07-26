import java.util.*;

public class WhileInputIsPositive
{
    public static void main (String [] args)
    {
        Scanner keys = new Scanner(System.in);
        int input;
        int sum = 0;

        System.out.print("Enter a number (negatives will end the input): ");
        input = keys.nextInt();

        while(input>=0){
            sum = sum +  input;
            //System.out.print("Enter a number (negatives will end the input): ");
            input = keys.nextInt();
        }
        System.out.printf("The sum is %d", sum);
    }
}