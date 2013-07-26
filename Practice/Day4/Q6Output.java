public class Q6Output
{
    public static void main(String [] args){
        int max = 0;
        findMax(1,2,max);
        System.out.println(max);
    }

    public static void findMax(int val1,int val2, int max){
        if(val1 > val2)
            max = val1;
        else
            max = val2;
    }

}