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
        values[x-1] = values[x-1] + 1;
    }

    public void changeInterval(int newInterval){
        if(newInterval > 0){
            interval = newInterval;
        }
    }

    public int countValues(int start, int end){
        int sum = 0;
        for(int i = start; i < end; i++){
            sum = sum + values[i - 1];
        }
        return sum;
    }

    public void print(){
        for(int i = 0; i < (values.length) / interval; i++){
            System.out.print("" + (i * interval + 1) + "-" + (i + 1) * interval + " ");
            
            if(i < values.length  / interval - 1){
                System.out.print(" ");
            }
            else if(i == 0){
                System.out.print(" ");
            }
            
            if(values[i] <= 10){
                System.out.print(" |");
            }
            else{
                System.out.print("|");
            }
            
            for(int j = 0; j < countValues ( i * interval + 1, i * interval + interval); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Histogram histo = new Histogram();
        Random rand = new Random();

        for(int i = 1; i<=100; i++)
        {   
            histo.add(rand.nextInt(100)+1);
        }

        histo.print();

        System.out.println("\nChanging the interval size to 20 and re-printing...\n");

        histo.changeInterval(20);
        histo.print();
    }

}
