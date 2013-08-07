package Q6;

public class Output
{
    public static void main (String [] args){

        Student s = new Student("Tryndamere", 220.2, 1337,3.5);
        s.attendClass();
        s.sleep();
        s.attendClass();
        s.attendClass();
        System.out.println(s.getName() + "'s gpa = " + s.getGpa());

    }
}