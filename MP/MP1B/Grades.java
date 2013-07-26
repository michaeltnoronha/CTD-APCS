import java.util.*;

public class Grades
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        int input;
        int choice =1;
        int a=0, b=0, c=0, d=0, f=0;
        
        System.out.println("Please enter the scores. End your input with a negative number.");
        
        do {
            
            input = keys.nextInt();
            
            if(input>=90 & input<=100){
                a++;              
            }
            else if(input>=80 & input<90){
                b++;
            }
            else if(input>=70 & input<80){
                c++;
            }
            else if(input>=60 & input<70){
                d++;
            }
            else if (input>=0 & input<60){
                f++;	
            }
        }while (input>=0);
        
        int total = (a+b+c+d+f);
        System.out.printf("Total number of grades = %d\n",total);
        System.out.printf("Number of A's = %d\n",a);
        System.out.printf("Number of B's = %d\n",b);
        System.out.printf("Number of C's = %d\n",c);
        System.out.printf("Number of D's = %d\n",d);
        System.out.printf("Number of F's = %d\n",f);

    }

}
