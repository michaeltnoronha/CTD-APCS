public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction (){
        numerator = 1;
        denominator = 1;
    }

    public Fraction (int aNumerator, int aDenominator){
        numerator = aNumerator;
        if(aDenominator != 0){
            denominator = aDenominator;
        }
        else{
            denominator = 1;
        }

        reduce();
    }

    public void setNumerator(int newNum){
        numerator = newNum;
        reduce();
    }

    public int getNumerator(){
        return this.numerator;
    }

    public void setDenominator(int newDenom){
        denominator = newDenom;
        reduce();
    }

    public int getDenominator(){
        return this.denominator;
    }

    public Fraction multiply(int constant){

        int newNumerator = this.numerator * constant;
        Fraction temp = new Fraction( newNumerator, denominator);
        return temp;
    }

    public Fraction multiply(Fraction other){
        int newNumerator = this.numerator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();

        return new Fraction(newNumerator, newDenominator);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }

    public void reduce(){
        int x = gcd(numerator, denominator);
        numerator = numerator / x;
        denominator = denominator / x;
    }

    //Returns this fraction's reciprocal
    //Do not modify the fraction, just make a new fraction
    //
    //precondition: numerator cannot be equal to 0
    //postcondition: returns a new fraction the uses the reciprocal of this
    
    public Fraction reciprocal(){
        return new Fraction(denominator, numerator);
    }
    
    public Fraction divide(Fraction other){
        return this.multiply(other.reciprocal());
    }
    
    // 3/4 or 4/3 or 0/1 or 0
    public void print(){
        System.out.printf("%d / %d",numerator, denominator);
    }
    
    //returns a string
    //  "3/4" or "1/2" or "6/5"
    public String toString(){
        String toString = numerator + "/" + denominator;
        return toString;
    }
    
    //returns this +  other as a fraction
    public Fraction add(Fraction other){
        int newNum = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenom = this.denominator * other.denominator;
        return new Fraction (newNum, newDenom);
    }
    
    //returns this - other as a fraction
    public Fraction subtract(Fraction other){
        int newNum = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenom = this.denominator * other.denominator;
        return new Fraction(newNum, newDenom);
    }
    
    //return a double representation of this fraction
    // 3/4 = 0.75
    public double evaluate(){
        return (double)numerator/denominator;
    }
    
}