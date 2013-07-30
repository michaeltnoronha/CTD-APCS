import java.awt.*;
import javax.swing.*;
public class Circle {
    //Instance Variables
    private double radius;

    //Constructors
    //If you do not write any constructors, JAVA will automaticall insert a blank default constructor for you!

    public Circle(){
        radius = 1.0;
    }

    public Circle(double someRadiusSentInFromTheClient){
        if(someRadiusSentInFromTheClient > 0)
            radius = someRadiusSentInFromTheClient;
        //someRadiusSentInFromTheClient = radius;  This is backwards
        else
            radius = 1;
    }

    //Methods

    //Getters simply return the instance variable
    //Getters should never have parameters

    public double getRadius(){
        return radius;
    }
    //setter method. Changes the instance variable to the parameter value
    //preconditiion > 0
    //
    //postcondition:
    //the radius of the object will be set to newRadius
    public void setRadius(double newRadius){
        if(newRadius > 0){
            radius = newRadius;
            //System.out.print("");
        }
    }
    
    public double area(){
        return Math.PI*radius*radius;
    }
    
    public double circumference(){
        return Math.PI*2*radius;
    }
    
    public void draw(Graphics g){
        g.fillOval(100,100,50,50);
    }
}   
