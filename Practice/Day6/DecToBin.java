import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        int input, binary_value;
        String continuequery = "";        
        
        do{
            System.out.print("Enter number to convert to binary: ");
            input = keys.nextInt();
            
            System.out.printf("%d in binary is ", input);
            convertToBinary(input);
            
            System.out.print("\nWould you like to convert another number?(Y/N)");
            
            continuequery = keys.next();
            
            //if(continuequery.charAt(0) == 'n' | continuequery.charAt(0) == 'N'){
            //    System.exit(0);
            //}
        }while(continuequery.charAt(0) == 'Y' | continuequery.charAt(0) == 'y');
        
    }

    public static int convertToBinary(int n) {
        int binary_value = 0;

        if(n == 0){
            binary_value = 0;
        }
        else if(n == 1){
            binary_value = 1;
        }
        else{
            convertToBinary(n / 2);
            System.out.print(n % 2);
        }
        return binary_value;
    }

}