package Histogram;
import java.util.*;

public class Histogram
{
    private int [] values;
    private int interval;

    public Histogram(){
        interval = 10;
        values = new int [100];
    }

    public int getInterval(){
        return interval;
    }

    public void add(int x){
        values[x] += 1;
    }

    public void changeInterval(int newInterval){
        interval = newInterval;
    }

    public int countValues(int start, int end){
        int sum = 0;
        for(int i = 0; i < (end - start) + 1; i++){
            sum = sum + values[i];
        }
        return sum;
    }

    public void print(){
        
    }

    public static void main(String [] args)
    {
        Histogram histo = new Histogram();
        Random rand = new Random();        //don’t forget to import java.util.*

        for(int i = 1; i<=100; i++)
        {   
            histo.add(rand.nextInt(100)+1);  //generating 100 random integers between 1 and 100.  
            //Adding them to the histogram as well
        }

        histo.print();

        System.out.println("\nChanging the interval size to 20 and re-printing...\n");

        histo.changeInterval(20);
        histo.print();
    }

}
