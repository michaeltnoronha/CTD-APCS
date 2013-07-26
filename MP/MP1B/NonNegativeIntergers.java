import java.util.*;

public class NonNegativeIntergers
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        int input = 0;
        int largest = 0;
        int smallest = 2147483647; //Any larger number would return an error, since this is the largest possible value of an int
        double average = 0;
        int sum = 0;

        for(double counter = 0; input >= 0; counter++ ){

            System.out.print("Enter a number (a negative ends the input): ");
            input = keys.nextInt();
            
            if(input>largest & input > 0){
                largest = input;
            }

            if(input<smallest & input > 0){
                smallest = input;
            }
            
            if(input > 0){
                sum = sum+input;
            }
            
            average = sum/counter;
        }
        
        System.out.printf("The largest value is: %d\n",largest);
        System.out.printf("The smallest value is: %d\n",smallest);
        System.out.printf("The average of your input is %f\n",average);
    }
}