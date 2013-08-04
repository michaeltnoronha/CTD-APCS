import java.util.*;

public class DrawingPractice3
{
    Scanner keys = new Scanner(System.in);
    
    System.out.print
    public static void main (String [] args){
        for(int i = 1; i <= input; i++){
            drawSpaces(input - i);
            drawStars((2*i)-1);
            
            System.out.println();
        }
    }

    public static void drawStars(int stars){
        for(i = 1; i <= stars; i++){
            System.out.print(" ");
        }
    }

    public static void drawSpaces(int spaces){
        for(int i = 1; i <= spaces; i++){
            System.out.print("*");
        }
    }
}