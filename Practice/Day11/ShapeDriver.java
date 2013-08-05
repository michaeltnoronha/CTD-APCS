public class ShapeDriver
{
    public static void main (String [] args){
        //Shape x = new Shape();
        //We cannot create objects of type Shape... Shape is not completely defines
        //defined: x.area()
        
        Shape[] list = new Shape[5];
        list[0] = new Triangle();
        list[1] = new Triangle(7,7);
        list[2] = new Rectangle(3,8);
        list[3] = new Triangle();
        list[4] = new Rectangle(10,10);
        
        for(Shape x : list){
            x.draw();
            System.out.print(x.area());
            System.out.println();
        }
    }
}