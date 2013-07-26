import java.util.*;

public class RandomSubtraction{
    public static void main (String [] args) {
        int int1;
        int int2;
        int input;
        Scanner keys =  new Scanner(System.in);
        
        int1 = (int)(Math.random()*100+1);
        int2 = (int)(Math.random()*100+1);
        
        
        
        System.out.printf("Please input the result of %d - %d: ", int1, int2);
        
        input = keys.nextInt();
        
        if((int1-int2) == input){
            System.out.println("Awesome! You can subtract...");
        }
        else{
            System.out.println("Clearly, you are bad at math...");
        }
    }
}
