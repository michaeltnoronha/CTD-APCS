public class Q1OutputTest{
    public static void main(String [] args)
    {
        int x = 9;
        int temp = -6;
        String type = getType(x);

        System.out.println(x + " is a " + type);
        System.out.println(temp);
    }

    public static String getType(int base,x)
    {
        String temp;

        if(x>0)
            temp = "+";
        else if(x < 0)
            temp = "-";
        else
        temp = "zero";

        return temp;
    }
}
