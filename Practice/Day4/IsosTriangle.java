import java.util.*;

public class IsosTriangle {
    public static void main (String [] args){
        int input;
        Scanner keys = new Scanner(System.in);
        
        System.out.print("Enter a height: ");
        input = keys.nextInt();
        drawTriangle(input);
    }

    public static void drawStars(int someHeight){

        for (int i=1; i<=someHeight; i++){
            System.out.print("*");
        }
    }

    public static void drawSpaces(int someHeight){
        for(int i=1; i<=someHeight; i++)
            System.out.print(" ");
    }

    public static void drawTriangle(int someHeight){
        for(int i = 1; i<=someHeight; i++){
            drawSpaces((someHeight-i)+1);
            drawStars((i*2)-1);
            System.out.println();            
        }
    }
}
