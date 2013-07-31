public class DieDriver
{
    public static void main(String [] args){
        Die first = new Die(); //default face is one
        System.out.println("The value of face is " + first.getFace());
        for(int i = 1; i <= 25; i++){
            first.roll(); //randomly changes the value of face
            System.out.println("The value of face is " + first.getFace());
        }
    }
}