import java.util.*;

public class UpsideDownTriangle
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);  
        
        int choice, height, a, b, c; 
        
        do{
            System.out.print("Enter the height: ");
            height = keys.nextInt();
            
            for(a=1; a<=height; a++){
                for(b=1; b<=a; b++){
                    System.out.print(" ");
                }
                for(c=0; c<=height-a; c++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
                        
            System.out.print("Want to go again(1 = yes, 2 = no)? ");
            choice = keys.nextInt();
            
            if(choice !=1){
                System.exit(0);
            }
            
        }while(choice == 1);
    }
}