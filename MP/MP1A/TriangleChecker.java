import java.util.*;

public class TriangleChecker
{
    public static void main (String [] args) {
        Scanner keys = new Scanner(System.in);
        double s1;
        double s2;
        double s3;

        System.out.print("Input side one: ");
        s1 = keys.nextDouble();
        System.out.print("Input side two: ");
        s2 = keys.nextDouble();
        System.out.print("Input side three: ");
        s3 = keys.nextDouble();

        if(s1+s2 <= s3)
        {
            System.out.printf("The 3 sides do not form a triangle because %d + %d is not > than %d", (int)s1, (int)s2, (int)s3);
        }
        else if(s2+s3 <= s1)
        {
            System.out.printf("The 3 sides do not form a triangle because %d + %d is not > than %d", (int)s2, (int)s3, (int)s1);
        }
        else if(s1+s3 <= s2)
        {
            System.out.printf("The 3 sides do not form a triangle because %d + %d is not > than %d", (int)s1, (int)s3, (int)s2);
        }
        else{
            System.out.println("The 3 sides do form a triangle");
        }
    }
}