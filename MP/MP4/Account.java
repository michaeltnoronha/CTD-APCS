import java.util.*;

public class Account
{
    private String name;
    private int id;
    private double balance;
    private double interestRate;
    private GregorianCalendar dateCreated;

    public Account(){
        name = "default";
        id = 0;
        interestRate = 1.0;
        dateCreated = null;
    }

    public Account(String name, int id, double balance, double interestRate, GregorianCalendar dateCreated){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public GregorianCalendar getDateCreated(){
        return dateCreated;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public void setDateCreate(GregorianCalendar dateCreated){
        this.dateCreated = dateCreated;
    }

    public boolean withdraw(double withdraw){
        if(withdraw > balance){
            return false;
        }
        else if(withdraw < 0){
            return false;
        }
        else{
            setBalance(balance - withdraw);
            return true;
        }
    }

    public boolean deposit(double deposit){
        if(deposit < 0){
            return false;  //The user is not able to deposit a negative value
        }
        else{
            setBalance(balance + deposit);
            return true;
        }
    }
}