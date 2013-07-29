import java.util.*;

public class DigitSum
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        int input, the_sum, goAgain;
        
        do{
            System.out.print("Enter a number: ");
            input = keys.nextInt();
            the_sum = sumDigits(input);
            System.out.print("The sum of the digits of " + input +" is " +the_sum);
            System.out.print("\nGo again(1 = yes, 2 = no): ");
            goAgain = keys.nextInt();
        }while (goAgain ==1);
    }
    
    /*public static int numDigits (int user_input){
        Scanner keys =  new Scanner(System.in);
        int counter;
        for(counter = 0; user_input>=1; counter++){
            user_input /= 10;           
        }
        return counter;
    }*/
    
    //The numDigits method is functional, but not necessary; for this reason I commented it out.
    
    public static int sumDigits (int input){
        //int numDigits = numDigits(input), 
        int sum;
        
        for(sum = 0; input > 0; input /= 10){
            sum = sum + (input % 10);
        }
        return sum;
    }
}