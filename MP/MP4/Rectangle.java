import java.util.*; 

public class Rectangle
{
    private int row;
    private int col;

    public Rectangle(){
        row = 0;
        col = 0;
    }

    public Rectangle(int row, int col){
        row = row;
        col = col;
    }

    public void display(){
        for(int i=1; i <= row; i++){
            for(int k=1; k<= col; k++){
                if(k ==1 | i ==1 | k == col | i == row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");            
        }
    }
    
    public int area(){
        int area = row * col;
        return area;
    }
    
    public int perim(){
        int perim = 0;
        
        if(area() == 1){
            perim = 1;
        }
        else{
            perim = row + row + col + col - 4;
        }
        return perim;
    }
    
    public void setRow(int row){
        this.row = row;
    }
    
    public void setCol(int col){
        this.col = col;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

}
