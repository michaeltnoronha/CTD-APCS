package Company;
import java.util.*;

public class Personnel
{
    private ArrayList<Employee> arrayList;

    public Personnel(){
        arrayList = new ArrayList<Employee>(10);
    }

    public void addEmployee(Employee e){
        if(arrayList.size() < 10){
            arrayList.add(e);
        }
        else{
            System.out.println("No longer hiring. Maximum employees reached");
        }
    }

    public ArrayList<Employee> getPersonnel(){
        return arrayList;
    }

    public void printAll(){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    public void removeEmployee(int index){
        arrayList.remove(index);
    }

    public Employee getEmployee(int index){
        return arrayList.get(index);
    }

    public void printCompany()
    {
        String code = arrayList.get(0).getDeptCode();
        int leastPayed = 0, mostPayed = 0, totalHours = 0, employees;
        double average = 0, totalPay = 0;

        if(arrayList.get(0).getFirstName().equals(""))
            employees = 0;
        else
            employees = arrayList.size();

        for(int i=0; i<arrayList.size(); i++)
        {
            if(arrayList.get(leastPayed).getWage()>arrayList.get(i).getWage())
                leastPayed = i;
            if(arrayList.get(mostPayed).getWage()<arrayList.get(i).getWage())
                mostPayed = i;
            totalPay += arrayList.get(i).getWage();
            totalHours += arrayList.get(i).getHours();
        }
        average = totalPay / arrayList.size();

        System.out.println("**************************************************\n");
        System.out.print("Dept - ");
        if(code.equals("MK"))
            System.out.println("Marketing");
        else if(code.equals("IT"))
            System.out.println("Information Technology");
        else if(code.equals("PY"))
            System.out.println("Payroll");
        System.out.println("        Total Employees: " + employees);
        System.out.println("        Minimum Wage: " + arrayList.get(leastPayed).getWage());
        System.out.println("        Maximum Wage: " + arrayList.get(mostPayed).getWage());
        System.out.println("        Average Wage: " + average);
        System.out.println("        Total " + code + " Weekly Hours: " + totalHours);
        System.out.println("        Total " + code + " Weekly Pay: " + totalPay);
    }
}