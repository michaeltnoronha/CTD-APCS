import java.util.*;

public class StudentDriver{
    public static void main(String [] args){
        ArrayList<Student> rayList = new ArrayList<Student>();
        rayList.add(new Student("Sam", 17));
        rayList.add(new 
            Student("Sandra", 18));
        rayList.add(new 
            Student("Billy", 16));
        rayList.add(new 
            Student("Greg", 17));
        rayList.add(new 
            Student("Jill", 18));

        System.out.println(rayList.get(0));	//LINE 1
        System.out.println(rayList.get(1));	//LINE 2
        System.out.println(rayList.get(2));	//LINE 3
        System.out.println(rayList.size());	//LINE 4
        System.out.println(rayList.remove(0)); //LINE 5
        System.out.println(rayList); // LINE 6
        System.out.println(rayList.remove(1)); // LINE 7
        System.out.println(rayList); // LINE 8
    }
}
