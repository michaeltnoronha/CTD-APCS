package Company;
import java.util.*; 

public class Driver 
{ 
    public static void main(String [] args) 
    { 
        Scanner keys = new Scanner(System.in); 

        Personnel x = new Personnel(); 
        String firstName;
        String lastName;
        String deptCode;
        double wages; 
        int hours; 

        Employee a = new Employee("//", "Soncin", "IT", 150000, 60);
        Employee b = new Employee("Lachina", "Heymann", "MK", 39000, 35);
        Employee c = new Employee("Ladislaus", "d'Nabokov", "IT", 275000, 64);
        Employee d = new Employee("LÆRKE", "╚═(███)═╝", "PY", 70000, 55);
        Employee e = new Employee("Laima", "Gleaves", "PY", 10000, 21);

        x.addEmployee(a);
        x.addEmployee(b);
        x.addEmployee(c);
        x.addEmployee(d);
        x.addEmployee(e);

        x.printAll();
    } 
}