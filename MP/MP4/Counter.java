public class Counter
{
    private int object_state;
    
    public Counter(){
        object_state = 0;
    }
    
    public Counter(int x){
        object_state = x;
    }
    
    public void reset(){
        object_state = 0;
    }
    
    public void increase(){
        object_state += 1;
    }
    
    public void decrease(){
        if(object_state >= 1){
            object_state -= 1;
        }
    }
    
    public int getCount(){
        return object_state;
    }
}