import java.util.*;
public class necklace
{
    public static void main(String[]args){
        Scanner keys = new Scanner(System.in);
        int i=1, k=1, usr1, usr2, j=1;
        System.out.print("Enter the first starting number: ");
        usr1=keys.nextInt();
        System.out.print("Enter the second starting number: ");
        usr2=keys.nextInt();
        i=usr1;
        k=usr2;
        System.out.print(usr1+ " " +usr2);
        do{
            j = (i+k)%10;
            i=k;
            k=j;
            System.out.print(" "  +j);
        }while(usr1!=i || usr2!= k);

       
       
    }
}