public class Q21Loop
{
    public static void main (String [] args){
        int sum = 0;

        for(int count = 2; count>0 & count<=100; count=count+2){
            sum=sum+count;
        }
        System.out.println(sum);
    }
}