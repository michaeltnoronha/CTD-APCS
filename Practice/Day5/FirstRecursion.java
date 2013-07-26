public class FirstRecursion
{

    public static int mystery(int x)
    {
        if(x <= 0)  //base case
            return 0;
        else
            return x + mystery(x-1);
    }

}