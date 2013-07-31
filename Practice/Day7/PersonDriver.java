public class PersonDriver{
    public static void main(String [] args){
        person me = new person("Greg", "Patrick", "Bushell",29);
        me.setFirstName("Gregory");
        me.setAge(25); //I wish!
        String init = me.initials(); //”GPB”
        System.out.println("My initials are " + init);
        me.print(); //Prints out all the variables
    }
}