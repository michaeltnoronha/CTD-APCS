package Temperature;

public class Temperature
{
    private double degrees;
    private String scale;

    public Temperature(){
        degrees = 0;
        scale = "C";
    }

    public Temperature(double degrees){
        this.degrees = degrees;
		scale = "C";
    }

    public Temperature(String scale){
        this.scale = scale;
		degrees = 0;
    }

    public Temperature(double degrees, String scale){
        this.degrees = degrees;
        this.scale = scale;
    }
    
    //precondition:
    //postcondition:
    //converts fahrenheit temp to celcius
    public double getCelsius(){
        if(scale.equalsIgnoreCase("F")){
            return (5.0/9.0) * (degrees - 32);
        }
        else{
            return degrees;
        }
    }

    public double getFahrenheit(){
        if(scale.equalsIgnoreCase("C")){
            return ((degrees * 9.0)/5.0)+32;
        }
        else{
            return degrees;
        }
    }

    public double getDegrees(){
        return degrees;
    }

    public String getScale(){
        return scale;
    }

    public void setDegrees(double degrees){
        this.degrees = degrees;
    }

    public void setScale(String scale){
        if(this.scale == scale){
            this.scale =  scale;
        }
        else if(this.scale == "F" & scale == "C"){
            this.scale = "C";
            degrees = ((degrees - 32)*5)/9;
        }
        else if(this.scale == "C" & scale == "F"){
            this.scale = "F";
            degrees = ((degrees * 9)/5) + 32;
        }
    }

    public boolean equals(Temperature other){
		double thisTemp = getCelsius();
		double otherTemp = other.getCelsius();
        return this.getCelsius() - other.getCelsius() < 0.00001 & this.getCelsius() - other.getCelsius() > - 0.00001;
    }

    public boolean greater(Temperature other){
        return this.getCelsius() - other.getCelsius() > 0;
    }
    
    //precondition: other cannot be null
    //postcondition:
    //ensures the scales match and then returns true if this
    //temperature's degrees is less than other's degrees
    public boolean lessThan(Temperature other){
        return this.getCelsius() - other.getCelsius() < 0;
    }
}