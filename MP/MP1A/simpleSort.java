import java.util.*;

public class simpleSort
{
    public static void main (String [] args) {
        int num1;
        int num2;
        int num3;
        Scanner keys =  new Scanner(System.in);
        
        System.out.print("Enter 3 numbers seperated by a space and I will sort them: ");
        num1 = keys.nextInt();
        num2 = keys.nextInt();
        num3 = keys.nextInt();
        
        if(num1>=num2 & num1>=num3) {
            if(num2>=num3){
                System.out.printf("%d >= %d >= %d", num1, num2, num3);
            }
            else {
                System.out.printf("%d >= %d >= %d", num1, num3, num2);
            }
        }
        else if(num2>=num1 & num2>=num3) {
            if(num1>=num3){
                System.out.printf("%d >= %d >= %d", num2, num1, num3);
            }
            else {
                System.out.printf("%d >= %d >= %d", num2, num3, num1);
            }
        }
        else {
            if(num2>=num1){
                System.out.printf("%d >= %d >= %d", num3, num2, num1);
            }
            else {
                System.out.printf("%d >= %d >= %d", num3, num1, num2);
            }
        }
    }
}