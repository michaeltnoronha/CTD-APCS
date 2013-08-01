package Temperature;
import java.util.*;

public class TemperatureDriver
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        double tempOne = 0, tempTwo = 0;
        String scaleOne, scaleTwo;
        Temperature temp1, temp2;
        boolean isEqual, isGreaterThan, isLessThan;

        System.out.print("Enter the first temperature: ");
        tempOne = keys.nextDouble();
        System.out.print("Enter the unit of the first temperature(C/F): ");
        scaleOne = keys.next();

        temp1 = new Temperature(tempOne, scaleOne);

        System.out.print("\nEnter another temperature: ");
        tempTwo = keys.nextDouble();
        System.out.print("Enter the unit of the second temperature(C/F): ");
        scaleTwo = keys.next();

        temp2 = new Temperature(tempTwo, scaleTwo);

        isEqual = temp1.equals(temp2);
        isGreaterThan = temp1.greater(temp2);
        isLessThan = temp1.lessThan(temp2);
		        
		System.out.print("\nNote: below the word degrees is being used as a blanket term\n to express both Celsius and Fahrenheit\n");

        if(isEqual){
            System.out.printf("\n%f degrees is equal to %f degrees",tempOne, tempTwo);
        }
        else{
            System.out.printf("\n%f degrees is not equal to %f degrees",tempOne, tempTwo);
        }
        
        if(isGreaterThan){
            System.out.printf("\n%f degrees is greater than %f degrees", tempOne, tempTwo);
        }
        else{
            System.out.printf("\n%f degrees is not greater than to %f degrees", tempOne, tempTwo);
        }
        
        if(isLessThan){
            System.out.printf("\n%f degrees is less than %f degrees", tempOne, tempTwo);
        }
        else{
            System.out.printf("\n%f degrees is not less than %f degrees", tempOne, tempTwo);
        }
    }
}