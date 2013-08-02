package Complex;

public class Complex{
    
    private double a;
    private double b;
    
    public Complex(double a){
        b = 0;
    }
    
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double abs(double a, double b){
        double abs = Math.sqrt((a * a) + (b * b));
        return abs;
    }
    
    public double add(Complex other){
        double sum = (a + other.a) + (b + other.b) * (Math.sqrt(-1));
        return sum;
    }
    
    public String toString(){
        String stringVersion = "" + a + " " + b + "i";
        return stringVersion;
    }
    
    public String multiply(Complex other){
        
        String product = "" + (this.a * a) + " " + "+" + " " + ((this.b * a)+(this.a * b)) + "i" + (this.b * b);
        return product;
    }
    
    public String multiply(double a, double b){
        //String product = "" + (
    }
}