package src;
import java.util.*;

public class PrimeChecker
{
    public static void main (String [] args){
        int possible_prime = 2;
        int primes_found = 0;
        
        while(primes_found < (int)1000000000)
        {
            if(isPrime(possible_prime)){
                primes_found++;
                System.out.println(possible_prime);
            }
            possible_prime++;
        }
    }
    public static boolean isPrime(int x){
        boolean prime = true;            
        for(int i=2; i < (int)Math.sqrt(x); i++){
            if(x%i == 0){
                prime = false;
                break;
            }
        }
        return prime;  
    }
}