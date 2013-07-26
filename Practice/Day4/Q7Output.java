public class Q7Output
{
    public static void main(String [] args){
        int times = 3;
        System.out.println("Before the call, times = " + times);
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call, times = " + times);
    }

    public static void nPrintln(String message, int n){
        while(n > 0){
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

}