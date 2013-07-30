import java.util.*;

public class DreadedX
{
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        int input,height;
        System.out.print("Enter the height (cannot be even): ");
        input = keys.nextInt();
        if(input % 2 == 0){
            System.out.println("The number that you entered was not odd. Will use "+ (input+1) +" instead.");
            height = input - 1;
        } else {
            height = input;
        }
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height; j++){
                if(i == j){
                    System.out.print("X");
                }else if(i + j == (height + 1)){
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}