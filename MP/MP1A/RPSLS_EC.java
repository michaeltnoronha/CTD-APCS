import java.util.*;

public class RPSLS_EC{
    public static void main (String [] args) {
        int input;
        int choice = 1;
        int computer_choice;

        Scanner keys =  new Scanner(System.in);

        do{
            System.out.println("Choose one of the following:");
            System.out.println("1) Scissors");
            System.out.println("2) Paper");
            System.out.println("3) Rock");
            System.out.println("4) Lizard");
            System.out.println("5) Spock");
            
            System.out.println(" ");

            computer_choice = 1 + (int)(Math.random() * 5);
            //System.out.println(computer_choice);
            input = keys.nextInt();

            if(input == 1){
                if(computer_choice == 2){
                    System.out.println("Computer chooses Paper");
                    System.out.println("Scissors cuts paper...you win!");
                }
                else if(computer_choice == 4){
                    System.out.println("Computer chooses Lizard");
                    System.out.println("Scissors decapitates lizard...you win!");                    
                }
                else if(computer_choice == 3){
                    System.out.println("Computer chooses Rock");
                    System.out.println("Rock crushes scissors...you lose!");
                }
                else if(computer_choice == 5){
                    System.out.println("Computer chooses Spock");
                    System.out.println("Spock smashes scissors...you lose!");
                }
                else{
                    System.out.println("Computer chooses Scissors");
                    System.out.println("It's a tie...you both lose");
                }
            }
            
            else if(input == 2){
                if(computer_choice == 3){
                    System.out.println("Computer chooses Rock");
                    System.out.println("Paper covers rock...you win!");
                }
                else if(computer_choice == 1){
                    System.out.println("Computer chooses Paper");
                    System.out.println("Scissors cuts paper...you lose!");
                }
                else if(computer_choice == 4){
                    System.out.println("Computer chooses Lizard");
                    System.out.println("Lizard eats paper...you lose!");
                }
                else if(computer_choice == 5){
                    System.out.println("Computer chooses Spock");
                    System.out.println("Paper disproves Spock...you win!");
                }
                else{
                    System.out.println("Computer chooses Paper");
                    System.out.println("It's a tie...you both lose");
                }
            }
            
            else if(input == 3){
                if(computer_choice == 2){
                    System.out.println("Computer chooses Paper");
                    System.out.println("Paper covers rock...you lose!");
                }
                else if(computer_choice == 4){
                    System.out.println("Computer chooses Lizard");
                    System.out.println("Rock crushes lizard...you win!");
                }
                else if(computer_choice == 5){
                    System.out.println("Computer chooses Spock");
                    System.out.println("Spock vaporizes rock...you lose!");
                }
                else if(computer_choice == 1){
                    System.out.println("Computer chooses Scissors");
                    System.out.println("Rock crushes scissors...you win!");
                }
                else{
                    System.out.println("Computer chooses Rock");
                    System.out.println("It's a tie...you both lose");
                }
            }
            
            else if(input == 4){
                if(computer_choice == 3){
                    System.out.println("Computer chooses Rock");
                    System.out.println("Rock crushes lizard...you lose!");
                }
                else if(computer_choice == 5){
                    System.out.println("Computer chooses Spock");
                    System.out.println("Lizard poisons Spock...you win!");
                }
                else if(computer_choice == 2){
                    System.out.println("Computer chooses Paper");
                    System.out.println("Lizard eats paper...you win!");
                }
                else if(computer_choice == 1){
                    System.out.println("Computer chooses Scissors");
                    System.out.println("Scissors decapitates lizard...you lose!");
                }
                else{
                    System.out.println("Computer chooses Lizard");
                    System.out.println("It's a tie...you both lose");
                }
            }
            
            else{
                if(computer_choice == 4){
                    System.out.println("Computer chooses Lizard");
                    System.out.println("Lizard poisons Spock...you lose!");
                }
                else if(computer_choice == 1){
                    System.out.println("Computer chooses Scissors");
                    System.out.println("Spock smashes scissors...you win!");
                }
                else if(computer_choice == 2){
                    System.out.println("Computer chooses Paper");
                    System.out.println("Paper disproves Spock...you lose!");
                }
                else if(computer_choice == 3){
                    System.out.println("Computer chooses Rock");
                    System.out.println("Spock vaporizes rock...you win!");
                }
                else{
                    System.out.println("Computer chooses Spock");
                    System.out.println("It's a tie...you both lose");
                }
            }
            
            System.out.println("Do you want to play again? (1 = yes, 2 = no)");
            choice = keys.nextInt();

        }while(choice == 1);
    }
}
