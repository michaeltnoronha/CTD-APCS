public class FractionDriver
{
    public static void main (String [] args){
        Fraction f = new Fraction(3,4);
        Fraction g = new Fraction(1,2);
        //Fraction h = new Fraction(5,6);
        /*f.setNumerator(7);
        f.setDenominator(3);
        g.setNumerator(6);
        g.setDenominator(4);
        */
        
        
        //this.setNumerator(7)
        //This makes no sense because THIS refers to the current object
        //and there isn't an object in this context
        
        
        //Fraction result = f.multiply(g);
		//Fraction result2 = f.multiply(25);
        //System.out.println(f.getDenominator());
        //System.out.println(result2.getDenominator());
        
        System.out.println(f);  //System.out.println(f);
        f.print();
        //Fraction product = f.multiply(g);
        //Fraction difference = f.subtract(g);
        //System.out.println(product);
        //System.out.println(difference);     
    }
}