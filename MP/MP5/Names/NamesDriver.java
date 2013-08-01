package Names;
import java.util.*;

public class NamesDriver
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        String firstNameOne, middleNameOne, lastNameOne, firstNameTwo, middleNameTwo, lastNameTwo;
        Names a;
        Names b;
        
        System.out.print("Enter a first name: ");
        firstNameOne = keys.next();
        System.out.print("Enter a middle name: ");
        middleNameOne = keys.next();
        System.out.print("Enter a last name: ");
        lastNameOne = keys.next();
        
        a = new Names(firstNameOne, middleNameOne, lastNameOne);

        System.out.println("Now please enter another name");

        System.out.print("Enter a first name: ");
        firstNameTwo = keys.next();
        System.out.print("Enter a middle name: ");
        middleNameTwo = keys.next();
        System.out.print("Enter a last name: ");
        lastNameTwo = keys.next();
        
        b = new Names(firstNameTwo, middleNameTwo, lastNameTwo);
        
        System.out.println("\nFor the first Name:");

        System.out.printf("\nFirst-Middle-Last: %s", a.firstMiddleLast());
        System.out.printf("\nLast-First-Middle: %s", a.lastFirstMiddle());
        System.out.printf("\nInitials: %s", a.initials());
        System.out.printf("\nLength of the name: %d", a.length());

        System.out.println("\nFor the second Name:");

        System.out.printf("First-Middle-Last: %s", b.firstMiddleLast());
        System.out.printf("\nLast-First-Middle: %s", b.lastFirstMiddle());
        System.out.printf("\nInitials: %s", b.initials());
        System.out.printf("\nLength of the name: %d", b.length());
        
        if(a.equals(b)){
            System.out.print("\nThe names are equal");
        }
        else{
            System.out.print("\nThe names are not equal");
        }
                
    }
}
