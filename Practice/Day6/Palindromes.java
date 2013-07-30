import java.util.Scanner;
public class Palindromes
{
    public static void main(String[]args)
    {
        Scanner keys = new Scanner(System.in);
        String input, continuequery = "";
        
        do{
            System.out.print("\nEnter a string to see if it's a palindrome: ");
            input = keys.nextLine();
            
            if(isPalindrome(input)){
                System.out.printf("%s is a palindrome\n", input);
            }
            else{
                System.out.printf("%s is not a palindrome.\n", input);
            }
            
            System.out.printf("Enter Q or q to quit - any other key to continue: ");
            
            continuequery = keys.nextLine();
            
            if(continuequery.charAt(0) == 'Q' | continuequery.charAt(0) == 'q'){
                System.exit(0);
            }
                            
        }while(continuequery.charAt(0) != 'q' & continuequery.charAt(0) != 'Q' );
    }

    public static boolean isPalindrome(String userinput)
    {
        if(userinput.length() == 0 | userinput.length() == 1){
            return true;
        } 
        else if(userinput.charAt(0) == userinput.charAt(userinput.length()-1)){
            return isPalindrome(userinput.substring(1, userinput.length()-1));
        }
        return false;
    }

}