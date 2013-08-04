package Histogram;

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
        
    }
}
