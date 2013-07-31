public class person
{
    private String firstname;
    private String middlename;
    private String lastname;
    private int age;

    public person(){
        firstname = "";
        middlename = "";
        lastname = "";
        age = 0;
    }

    public person(String firstname, String middlename, String lastname, int age){
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        if( age > 0){
            this.age = age;
        }
        else{
            age = 0;
        }
    }

    public String getFirstName(){
        return firstname;
    }

    public String getMiddleName(){
        return middlename;
    }

    public String getLastName(){
        return lastname;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public void setMiddleName(String middlename){
        this.middlename = middlename;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String initials(){
        String initials = ""+firstname.charAt(0) + middlename.charAt(0) + lastname.charAt(0);
        return initials;
    }

    public void print(){
        System.out.println(getFirstName());
        System.out.println(getMiddleName());
        System.out.println(getLastName());
        System.out.println(getAge());
    }
}