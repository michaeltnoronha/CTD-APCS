public class Triangle extends Shape
{
    private int height;
    private int base;

    public Triangle(){
        height = 3;
        base = 3;
    }

    //precondition: h == b is true
    public Triangle(int h, int b){
        if(h == b){
            height = h;
            base = b;
        }
        else{
            height = h;
            base = height;
        }
    }

    public int getHeight(){
        return height;
    }

    public int getBase(){
        return base;
    }

    public void setHeight(int newB){
        height = newB;
        base = newB;
    }

    //override the abstract draw method from shape
    public void draw(){
        for(int i = 1; i <= height; i++){
            for(int s = 1; s <= i; s++)
                System.out.print("*");
            System.out.println();
        }
    }
    //override the abstract area method from Shape
    public double area(){
        return (base*height) / 2;
    }

}