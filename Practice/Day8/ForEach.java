public class ForEach
{
    public static void main (String [] args){
        int [] scores = new int[100000000];
        
        for(int i = 0; i < scores.length; i++){
            scores[i] = i * 100;
        }
        
        for(int value : scores){
            System.out.println(value);
        }
    }
}