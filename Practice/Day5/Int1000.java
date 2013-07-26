public class Int1000
{
    public static void main (String [] args){

        {
            methodA(1000);
        }
    }

    public static void methodA(int n)
    {
        if(n == 1){
            System.out.println(n);
        }
        else
        {
            methodA(n-1);
            System.out.println(n);
        }
    }
}