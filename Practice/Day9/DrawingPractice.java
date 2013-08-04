import java.util.*;

public class DrawingPractice
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);

        System.out.println("Enter a height");

        int input = keys.nextInt();

        for(int i = 1; i <= input; i++){
            printSpaces(i-1);
            printStars(1);
            printSpaces(2*(input-i)-1);
            if(i!=input){
                printStars(1);
            }
            System.out.println();
        }

    }

    public static void printSpaces(int spaces){
        for(int i = 1; i <= spaces; i++){
            System.out.print(" ");
        }
    }

    public static void printStars(int stars){
        for(int i = 1; i<= stars; i++){
            System.out.print("*");
        }
    }
}