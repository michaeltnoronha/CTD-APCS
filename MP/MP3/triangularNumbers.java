import java.util.*;

public class triangularNumbers
{
    public static void main (String [] args){
        int input, nth_triangular_number;
        
        System.out.print("Please enter a number: ");
        input = getInput();
        nth_triangular_number = getTriangularNumber(input);
        
        print(input,nth_triangular_number);
    }
    
    public static int getTriangularNumber(int userinput){
        int triangularNum;
        
        if(userinput == 1){
            triangularNum = 1;
        }
        else{
            triangularNum = userinput + getTriangularNumber(userinput-1);
        }
        
        return triangularNum;
    }
    
    public static int getInput(){
        Scanner keys = new Scanner(System.in);
        
        int userinput = keys.nextInt();
        
        return userinput;
    }
    
    public static void print(int input, int nth_triangular_number){
        System.out.printf("The %d triangular number is %d", input, nth_triangular_number);
    }
}