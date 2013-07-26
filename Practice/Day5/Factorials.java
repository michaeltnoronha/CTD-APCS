import java.util.*;

public class Factorials
{
    public static void main (String [] args){
        Scanner keys = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int n = keys.nextInt();
        
        factorial(n);
        
        System.out.printf("%d factorial equals %d",n,factorial2(n));
        
        /*
         * int result = calculateFactorial(input);
         */
        
    }
    
    /*
     * public static int calculateFactorial(int input){
     *     return factorial3(input,1);
     *     }
     */
        

    public static int factorial (int n){
        int product = 1;

        for(int i=1; i<=n; i++){
            product=product*i;
        }
        return product;
    }
    
    public static int factorial2 (int n){
        if(n ==0 || n ==1){
            return 1;
        }
        else{
            return n*factorial2(n-1);
        }
    }
    
    //An example of tail recursion. The recursive call is the LAST line of code that executes.
    public static int factorial3 (int n, int result){
        if(n == 0){
            return result;
        }
        else{
            result = result * n;
            return factorial3(n-1, result);
        }
    }
}