public class CounterDriver
{
    public static void main (String [] args){
        Counter first = new Counter();
        Counter second = new Counter(10);
               
        System.out.println("My first counter starts at " + first.getCount());
        
        System.out.println("My second counter starts at " + second.getCount());
        
        System.out.println("Increased first counter one time...");
        first.increase();
        System.out.println("My first counter is now " + first.getCount());
        
        System.out.println("Now I will use a loop and decrease my second counter 2 times by 1...");
        for(int i = 1; i <= 2; i++){
            second.decrease();
        }
        System.out.println("My second counter is now " + second.getCount());
        for(int k = 1; k <= 100; k++){
            second.decrease();
        }
        System.out.println("Now I will decrease my second counter by 100, but the value will remain at 0");
        System.out.println("My second counter is now " + second.getCount()); 
    }
}