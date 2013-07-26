import java.util.*; //import java.util.Scanner;

public class Input {
    public static void main (String [] args) {
        int input;
        Scanner keys = new Scanner(System.in);
        
        //TO GET INPUT FROM THE KEYBOARD, YOU MUST FIRST PROMPT THE USER TO ENTER SOMETHING
        //IF YOU DON'T, YOUR PROGRAM WILL SIT THERE AND LOOK DUMB
        
        System.out.print("Enter a number: ");
        input = keys.nextInt(); //Reads in the next integer
        System.out.printf("You entered %d",input);
        //System.out.print("You entered " + input);
    }
}