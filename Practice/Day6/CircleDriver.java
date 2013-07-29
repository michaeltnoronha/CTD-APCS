//Client Class. This class will utilize some other class that another programmer wrote

public class CircleDriver {
	public static void main (String [] args){
		//Create a Circle object
		Circle myFirstCircle = new Circle();  //default constructor
		Circle mySecondCircle = new Circle(5.2); //the other constructor
		System.out.println(mySecondCircle.getRadius());
		mySecondCircle.setRadius(7.8);
		System.out.println(mySecondCircle.area());
	}
}
