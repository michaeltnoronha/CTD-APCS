import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter the size of the table: ");
        int size = keys.nextInt();
        int fieldWidth = ("" + (size*size)).length() + 1;
        System.out.println();

        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
                System.out.printf("%"+fieldWidth+"d", i * j);
            System.out.println();
        }
    }
}