public class IterationCount_6{
    public static void main (String [] args)
    {
        int count = 0; 
        int number = 2;
        boolean done = false;
        while (! done)
        {
            number = number * 2;
            if (number > 64)
                done = true;
            count++; // This is the iteration counter!
            System.out.println(count);
        }
        
    }
}