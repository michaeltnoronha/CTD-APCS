import java.util.*; 

public class SimpleCircle { 
    public static void main (String [] args){ 
        Scanner keys = new Scanner(System.in);

        double aRadius; 
        int userchoice;
        String userquery;

        do{
            System.out.print("Please enter a radius: "); 
            aRadius = keys.nextDouble(); 

            System.out.println("(1) Calculate Area"); 
            System.out.println("(2) Calculate Circumference"); 
            System.out.print("Please select an option: "); 
            userchoice = keys.nextInt(); 

            if(userchoice == 1){ 
                double arearesult = calculateArea(aRadius); 
                System.out.printf("The area of a circle with radius %f is %f\n",aRadius, arearesult); 
            } 
            else if(userchoice == 2){ 
                double circumresult = calculateCircumference(aRadius); 
                System.out.printf("The circumference of a circle with radius %f is %f\n", aRadius, circumresult); 
            }

            do{
                System.out.print("Would you like to enter a new radius(Y/N)? ");
                userquery = keys.next();

            }while(userquery.charAt(0) != 'Y' & userquery.charAt(0) != 'N' & userquery.charAt(0) != 'y' & userquery.charAt(0) != 'n');

        }while(userquery.charAt(0) == 'Y' | userquery.charAt(0) == 'y');

    } 

    public static double calculateArea(double aRadius){ 
        double area = (Math.PI)*(aRadius)*(aRadius); 
        return area; 
    } 

    public static double calculateCircumference(double aRadius){ 
        double circumference = (2)*(aRadius)*(Math.PI); 
        return circumference; 
    } 
}