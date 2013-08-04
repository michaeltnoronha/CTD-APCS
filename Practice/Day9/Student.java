public class Student{
   private String name;
   private int age;
   
   public Student(String n, int a){
      name = n;
      age = a;
   }

   public String toString(){
      return name + " is " + age                                            
                  + " years old";
   }
}
