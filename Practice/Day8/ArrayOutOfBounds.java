public class ArrayOutOfBounds
{
    public static void main (String [] args){
        
        int [] codes = new int[5];
        for(int index = 0; index < codes.length; index++){
            codes[index] = index*50 + 1;
        }
        
    }
}