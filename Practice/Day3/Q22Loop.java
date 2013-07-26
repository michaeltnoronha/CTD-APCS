public class Q22Loop
{
    public static void main (String [] args){
        for(int i = 1; i>0 & i<=100; i++){
            if(i%10 == 0){
                System.out.printf("%d \n",i);
            }
            else {
                System.out.printf("%d ",i);
            }
        }
    }
}