import java.util.*;

public class DrawingPractice1
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);

        System.out.println("Enter a height for an isos triangle");
        int height = keys.nextInt();

        for(int i = 0; i < height; i++){
            for(int k = 0; k < (2*i) - 1; k++){
                if(){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }	
            }
        }
        System.out.println();
    }
}
