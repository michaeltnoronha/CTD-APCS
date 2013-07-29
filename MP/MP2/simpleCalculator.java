import java.util.*;
public class simpleCalculator {
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        int firstnumber, secondnumber, calculation;
        String operation, continuequery;
        

        do{ 
            System.out.print("Please enter the first number: ");
            firstnumber = keys.nextInt();
            System.out.print("Please enter the second number: ");
            secondnumber = keys.nextInt();
            System.out.print("Please enter the operation (+,-,*,/):");
            operation = keys.next();

            if(operation.charAt(0) == '+' | operation.charAt(0) == '-' | operation.charAt(0) == '*' | operation.charAt(0) == '/'){
                compute(firstnumber, secondnumber, operation); 
            }
            else{
                System.out.println("Illegal Operation!");
            }
            
            calculation = compute(firstnumber, secondnumber, operation);
            System.out.printf("%d %s %d = %d\n", firstnumber, operation, secondnumber, calculation);
            
            do{
                System.out.print("Would you like to go again(Y/N)?");
                continuequery = keys.next();
            }while(continuequery.charAt(0) != 'Y' & continuequery.charAt(0) != 'y' & continuequery.charAt(0) != 'N' & continuequery.charAt(0) != 'n');
        }while(continuequery.charAt(0) == 'Y' | continuequery.charAt(0) == 'y');

    }
    public static int compute(int firstnum, int secondnum, String operation){
        Scanner keys = new Scanner(System.in);
        int calculation = 0;
        
        if(operation.charAt(0) == '+'){
            calculation = firstnum + secondnum;
        }
        else if(operation.charAt(0) == '-'){
            calculation = firstnum - secondnum;
        }
        else if(operation.charAt(0) == '*'){
            calculation = firstnum * secondnum;
        }        
        else if(operation.charAt(0) == '/'){
            calculation = firstnum / secondnum;
        }
        
        return calculation;
    }
}
