import java.util.*;
public class AccountDriver{

    public static void main(String [] args){
        String nameInput;
        double initialDeposit,additionalDeposit, withdraw;
        int id;
        Account acc;
        Scanner keys = new Scanner(System.in);
        GregorianCalendar currentDate = new GregorianCalendar();
        int userChoice; 

        System.out.print("To create your account, enter your name: ");
        nameInput = keys.next();
        System.out.print("Enter intial deposit amount: ");
        initialDeposit = keys.nextDouble();
        System.out.println("Computer randomly generating an ID for your account...");
        id = (int)(Math.random()*10000+1);
        System.out.println("Your randomized account id is " + id);
        System.out.println("The interest rate is currently 1.5%");
        System.out.println("Now the computer will call the constructor and create your account...\n");
        //CREATE OR INSTANTIATE ACC WITH THE CORRECT INPUT
        
        acc = new Account(nameInput, id, initialDeposit, 1.5, currentDate);
        
        do{
            printMenu();
            System.out.print("\n\nEnter a choice: ");
            userChoice = keys.nextInt();
            switch(userChoice){
                case 1: 
                //PRINT OUT THE ACCOUNT NAME.  MAKE SURE TO USE THE OBJECT AND
                //NOT THE VARIABLE NAMEINPUT FROM ABOVE
                System.out.print("Account Name: " + acc.getName());
                break;
                case 2: 
                System.out.print("Date Created: ");
                System.out.print(acc.getDateCreated().get(Calendar.MONTH)+1);
                System.out.print("/" +acc.getDateCreated().get(Calendar.DAY_OF_MONTH));
                System.out.println("/" + acc.getDateCreated().get(Calendar.YEAR));
                break;
                case 3:
                //PRINT OUT THE CURRENT ACCOUNT BALANCE. USE THE OBJECT
                System.out.print("$" + acc.getBalance());
                break;
                case 4:
                System.out.print("Enter the deposit amount: ");
                additionalDeposit = keys.nextDouble();
                //DEPOSIT THE AMOUNT SHOWN ABOVE INTO THE ACCOUNT
                if(acc.deposit(additionalDeposit)){
                   //System.out.print(additionalDeposit);
                }
                break;
                case 5: 
                System.out.print("Enter the withdraw ammount: ");
                withdraw = keys.nextDouble();
                //WRITE THE BRANCH STATEMENT TO CORRECTLY PERFORM THE WITHDRAW. 
                //CHECK THE SAMPLE OUTPUT.
                if(acc.withdraw(withdraw)){
                    System.out.print("Please take you cash!");
                }
                break;
                case 6: 
                System.out.println("Have a nice day!");
                break;
                default:
                System.out.print("Invalid choice...choose again");
            }
            System.out.println();
        }while(userChoice != 6);

    }

    public static void printMenu(){
        for(int i = 1; i <= 20; i++)
            System.out.print("*");
        System.out.print("World's Best Bank ATM");
        for(int i = 1; i <= 20; i++)
            System.out.print("*");
        System.out.println("\n1. View Account Name");
        System.out.println("2. View Date Created");
        System.out.println("3. View Current Balance");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");
        for(int i = 1; i <= 61; i++)
            System.out.print("*");
    }
}

/**
 * An example of a method - replace this comment with your own
 *
 * @param  y   a sample parameter for a method
 * @return     the sum of x and y
 */
//public int sampleMethod(int y)
//{
// put your code here
//return y;
//}

