import java.util.*;
public class Nim
{

    public static void main(String[] args){
        int userinput = 0;
        int remaining = 0;
        String continuequery = "";

        do{
            remaining = (int)(Math.random()*16	+15);
            Scanner keys = new Scanner(System.in);

            while(remaining > 0){
                System.out.printf("There are %d stones. ", remaining);

                do{
                    System.out.print("How many would you like? ");
                    userinput = keys.nextInt();
                }while(!isValidEntry(userinput));

                remaining = remaining - userinput;

                System.out.printf("There are %d stones ", remaining);

                if(remaining == 1){
                    System.out.println("\nThe player beats the computer!");
                    break;
                }

                remaining = drawStones(remaining);

                if(remaining == 1){
                    System.out.println("\nThe computer beats the player!");
                    break;
                }
            }
            do{
                System.out.print("Would you like to go again(Y/N) ");
                continuequery=keys.next();
            }while(continuequery.charAt(0) != 'Y' & continuequery.charAt(0) != 'y' & continuequery.charAt(0) != 'N' & continuequery.charAt(0) != 'n');
        }while(continuequery.charAt(0) == 'Y' | continuequery.charAt(0) == 'y');

    }

    public static boolean isValidEntry(int userinput){
        boolean valid;

        if(userinput == 1 | userinput == 2 | userinput == 3){
            valid = true;
        }
        else{
            valid = false;
        }
        return valid;
    }

    public static int drawStones(int stones ){
        int computer_choice = 0, stonetaken = 0;
        stonetaken = stones;
        if(stonetaken == 2){
            System.out.print("The computer takes 1 stones.\n");
            stonetaken = stonetaken-1;
        }

        else if (stonetaken >= 3){

            computer_choice = (int)((Math.random()*3));

            if(computer_choice == 0){
                System.out.print("The computer takes 1 stone\n");
                stonetaken = stonetaken - 1;
            }
            if(computer_choice == 1){
                System.out.print("The computer takes 2 stones\n");
                stonetaken = stonetaken - 2;
            }
            if(computer_choice == 2){
                System.out.print("The computer takes 3 stones\n");
                stonetaken = stonetaken - 3;
            }
        }

        return stonetaken;
    }

}