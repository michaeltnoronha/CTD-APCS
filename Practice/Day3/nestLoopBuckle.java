import java.util.*;

public class nestLoopBuckle
{
    public static void main (String [] args)
    {
        Scanner keys = new Scanner(System.in);
        int height;
        int r;
        int k;
        int choice = 1;
        //int width;

        do{
            System.out.print("Enter a height: ");
            height= keys.nextInt();
            for(r = 1; r <= height; r++){
                for (k = height-r+1 ; k > 0; k--){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Do you want to go again? (1 = yes, 2 = no)");
            choice = keys.nextInt();
        }while(choice == 1);
    }
}
