package Names;

public class Names
{
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(){
        firstName = "";
        middleName = "";
        lastName = "";
    }

    public Names(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public String getFirst(){
        return firstName; 
    }
    
    public String getMiddle(){
        return middleName;
    }
    
    public String getLast(){
        return lastName;
    }
    
    public String firstMiddleLast(){
        String firstMiddleLast = "" + firstName + " " + middleName + " " + lastName;
        return firstMiddleLast;
    }
    
    public String lastFirstMiddle(){
        String lastFirstMiddle = lastName + ", " + firstName + " " + middleName;
        return lastFirstMiddle;
    }
    
    public boolean equals(Names otherName){
        return (firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()));       
    }
    
    public String initials(){
        String firstUpCase = firstName.toUpperCase();
        String middleUpCase = middleName.toUpperCase();
        String lastUpCase = lastName.toUpperCase();
        
        String initials = "" + firstUpCase.charAt(0) + middleUpCase.charAt(0) + lastUpCase.charAt(0);
        return initials;
    }
    
    public int length(){
        int length = firstName.length() + middleName.length() + lastName.length();
        return length;
    }
}