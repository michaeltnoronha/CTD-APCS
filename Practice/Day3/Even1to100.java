public class Even1to100
{
    public static void main (String [] args){
        int x=1;
        while(x<=100)
        {
            if(x%2 == 0)
                System.out.println(x);
            x++;
        }
    }
}
