package Company;
import java.util.*;

public class Driver
{
    public static void main(String [] args)
    {
        Scanner keys = new Scanner(System.in);

        ArrayList<Personnel> testObject = new ArrayList<Personnel>(3);
        String firstName, lastName, dept;
        String [] depts = new String[]{"MK","IT","PY"};
        double wages;
        int hours;

        for(int i = 0; i < 3; i++)
            testObject.add(new Personnel());

        System.out.println("Enter employee names. Enter \"end\" to stop.");

        do{       
            System.out.print("First name: ");
            firstName = keys.next();
            if(firstName.equals("end")){
                break;
            }

            System.out.print("Last name: ");
            lastName = keys.next();

            System.out.print("Dept Code: ");
            dept = keys.next();

            System.out.print("Wage: ");
            wages = keys.nextDouble();

            System.out.print("Hours: ");
            hours = keys.nextInt();

            if(testObject.get(0).getPersonnel().size() + testObject.get(1).getPersonnel().size() + testObject.get(2).getPersonnel().size() < 10){
                for(int i = 0; i < 4; i++){
                    if(i == 3){
                        System.out.println("Invalid department code. Try again.");
                    }
                    else if(dept.equals(depts[i])){
                        testObject.get(i).addEmployee(new Employee(firstName, lastName, dept, wages, hours));
                    }
                }
            }
        }while(!firstName.equals("done"));

        
        for(int i = 0; i < 3; i++)
        {
            if(testObject.get(i).getPersonnel().size() == 0){
                testObject.get(i).addEmployee(new Employee("", "", depts[i], 0, 0));
            }

            testObject.get(i).printCompany();
        }
    }
}
