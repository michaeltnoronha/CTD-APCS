public class Rectangle extends Shape
{
    private int length;
    private int width;
    
    public Rectangle(){
        length = 5;
        width = 5;
    }
    
    public Rectangle(int l, int w){
        length = l;
        width = w;
    }
    
    public void draw(){
        for(int i = 1; i <= length; i++){
            for(int k = 1; k <= width; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public double area(){
        return length * width;
    }
}
