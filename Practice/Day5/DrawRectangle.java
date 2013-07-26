import java.util.*;

public class DrawRectangle
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        
        int height, input,width;
        System.out.print("Input a size: ");
        input = keys.nextInt();
        
        for(height = 1; height <= input; height++){
            for(width = 1; width<= input; width++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}