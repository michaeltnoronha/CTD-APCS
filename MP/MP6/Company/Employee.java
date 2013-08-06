package Company;

public class Employee
{
    private String lastName;
    private String firstName;
    private String deptCode;
    private double wage;
    private int hours;

    public Employee(){
        lastName = "";
        firstName = "";
        deptCode = "";
        wage = 0;
        hours = 0;
    }

    public Employee(String lastName, String firstName, String deptCode, double wage, int hours){
        this.lastName = lastName;
        this.firstName = firstName;
        this.deptCode = deptCode;
        this.wage = wage;
        this.hours = hours;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getDeptCode(){
        return deptCode;
    }

    public double getWage(){
        return wage;
    }

    public double getHours(){
        return hours;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setDeptCode(String deptCode){
        this.deptCode = deptCode;
    }
    
    public void setWage(double wage){
        this.wage = wage;
    }
    
    public void setHours(int hours){
        this.hours = hours;
    }
    
    public String getDeptName(String deptCode){
        String deptName = "";
        if(deptCode == "MK"){
            deptName = "Marketing";
        }
        else if(deptCode == "IT"){
            deptName = "Information Technology";
        }
        else if(deptCode == "PY"){
            deptName = "Payroll";
        }
        else{
            deptName = "Invalid department name";
        }
        return deptName;
    }
}