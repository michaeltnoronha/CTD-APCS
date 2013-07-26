/*
 * Michael Noronha
 * 
 * The code below demonstrates the effect of System.out.print,
 * used rather than System.out.println. It prints "     Spaces"
 * "     are fun" on one line.
 */

/*
 * By removing the print(ln) from our code and instead using
 * print, the line break that previously existed and kept the
 * two strings on different lines was removed. 
 */



public class ModifiedSpaces {
    public static void main (String [] args){
        System.out.print("     Spaces");
        System.out.print("     are fun");
    }
}