import java.util.*;

public class RectangleDriver
{
    public static void main (String [] args){
        Scanner keys = new Scanner(System.in);
        int row = 0, col = 0, area = 0, perim = 0;
        
        Rectangle instance = new Rectangle();       
        instance.display();
        
        Rectangle userinput = new Rectangle(row, col);
        
        System.out.print("Enter the number of rows: ");
        row = keys.nextInt();
        System.out.print("Enter the number of columns: ");
        col = keys.nextInt();      
        
        userinput.setRow(row);
        userinput.setCol(col);
        
        userinput.display();
        
        area = userinput.area();
        perim = userinput.perim();
        System.out.printf("The area of the rectangle is %d and the perimeter is %d", area, perim);
    }
}