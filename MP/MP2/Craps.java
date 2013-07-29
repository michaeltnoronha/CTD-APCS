import java.util.*;
public class Craps
{

    public static void main(String[]args){
        Scanner keys=new Scanner(System.in);
        int roll = 1, initial = 0, currentpoint = 1;
        //Initial will determine whether or not you lose or win right away or not
        String continuequery;
        do{
            currentpoint = rollGenerator(roll);
            initial= 0;
            if(currentpoint == 2 | currentpoint == 3 | currentpoint == 12){
                System.out.println("You lose");
                initial = 1;
            }
            else if(currentpoint == 7 | currentpoint == 11){
                System.out.println("You win");
                initial = 1;
            }
            else{
                System.out.printf("Point is %d\n",currentpoint);
            }
            
            while(initial != 1){
                roll = rollGenerator(roll);
                
                if(roll == currentpoint){
                    System.out.println("You win");
                    break;
                }
                else if(roll == 7){
                    System.out.println("You lose");
                    break;
                }
            }
            
            System.out.print("Go again(Y/N)?");
            continuequery = keys.next();
            
            if(continuequery.charAt(0) == 'n' | continuequery.charAt(0) == 'N'){
                System.exit(0);
            }
            
        }while(continuequery.charAt(0) == 'Y' | continuequery.charAt(0) == 'y');
    }

    public static int rollGenerator(int roll){
        int firstnum, secondnum, remainingrocks;
        
        remainingrocks = roll;
        
        firstnum = (int)(Math.random()*6+1);
        secondnum = (int)(Math.random()*6+1);
        
        remainingrocks = firstnum + secondnum;
        
        System.out.printf("You rolled %d + %d = %d\n", firstnum, secondnum, remainingrocks);
        
        return remainingrocks;
    }
}