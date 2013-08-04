package Numbers;
import java.util.*;

public class NumbersDriver
{
    public static void main (String [] args){
        Numbers userArray;
        int length, multiple;
        Scanner keys = new Scanner(System.in);

        System.out.print("Enter an array length: ");
        length = keys.nextInt();

        userArray = new Numbers(length);

        System.out.print("Here is the array\n");
        userArray.print();

        System.out.print("\nEnter a number to check for multiples: ");
        multiple = keys.nextInt();

        if(userArray.hasMultipleOf(multiple)){
            System.out.printf("\nThere is a multiple of %d in the array", multiple);
        }
        else{
            System.out.printf("\nThere is not a multiple of %d in the array", multiple);
        }
        
        System.out.printf("\nThere are %d odd numbers in the array", userArray.countOddNumbers());
    }
}

