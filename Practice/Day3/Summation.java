import java.util.*;

public class Summation 
{
    public static void main (String [] args)
    {
        int count = 1, sum = 0;
        int limit;
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Enter a number for the summation to end at: ");
        limit=keys.nextInt();
        while(count <= limit){
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}