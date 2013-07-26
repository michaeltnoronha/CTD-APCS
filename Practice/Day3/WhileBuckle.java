import java.util.*;

public class WhileBuckle 
{
    public static void main (String [] args)
    {
        Scanner keys = new Scanner(System.in);
        int input, counter=1, choice;

        do{
            counter = 1;
            System.out.print("Enter a number: ");
            input = keys.nextInt();

            while(counter <= input) {
                System.out.printf("%d, ",counter);
                counter++;
            }
            System.out.print("\nBuckle my shoe.");
            System.out.println("Do you want to go again? (1 = yes, 2 = no)");
            choice = keys.nextInt();
        }while(choice == 1);

    }
}