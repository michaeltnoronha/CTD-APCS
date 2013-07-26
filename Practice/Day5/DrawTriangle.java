import java.util.*;

public class DrawTriangle
{
    public static void main (String [] args){
        Scanner keys = new Scanner (System.in);
        
        int height, width, input;
        
        System.out.print("Enter a height for the isos triangle: ");
        input = keys.nextInt();
        
        for(height = 1; height <=input; height++){
            for(width = 1; width<=(input*2)-1; width++){
                if(input-height>=width){
                    System.out.print(" ");
                }
                else if(input + height > width){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}