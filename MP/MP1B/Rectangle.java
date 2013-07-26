import java.util.*; 

public class Rectangle
{
    public static void main (String [] args) {
        int length;
        int width;
        
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        length = keys.nextInt();
        System.out.println("Enter the number of columns:");
        width = keys.nextInt();
        
        for(int i=1; i<=length; i++){
            for(int k=1; k<=width; k++){
                if(k ==1 | i ==1 | k == width | i == length){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");            
        }
        
        
        
    }
}