public abstract class Shape implements Comparable
//By implementing the Comparable interface, we are ensuriong that our Shapes can be compared
//to one another
{
    private String name;
    
    public Shape(){
        name = "default";
    }
    
    public Shape(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    //By declaring area() to be abstract, we are essentially saying
    //we cannot define how area works for generic shapes
    public abstract double area();
    
    public abstract void draw();
    
    //-1 ==> this <  other
    //0 ==> this == other
    //1 ==> this > other
    public int compareTo(Object other){
        double thisArea = this.area();
        double otherArea = other.area();
        
        if(this.Area < otherArea){
            return -1;
        }
        else if(thisArea == otherArea){
            return 0;
        }
        else{
            return 1;
        }
    }
}
