
//Create an Employee class. The employee class should have a name instance variable, a static company variable set to Veridian Dynamics, and a non-static method displayEmployeeInfo(). displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names. Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.
public class Employee {
    // Instance variables are qualities the class has
    // Instance variables belong to the Instance
     public String Admin;

     public String name;

     // static method or variable belong to the class
     public static String company = "Veridian Dynamics";


     // methods are things the class does
     public String displayEmployeeIfo(){
         return name + " works at "+company;
     }

     // Constructors are what make the instance
     public Employee(){
         System.out.println("We have a new employee!");
     }
     public Employee(int admin, String name){
         this.name = name;
         switch (admin){
             case 1 -> Admin =  "yes";
             case 2 -> Admin = "premium";
             default -> Admin = "RESTRICTED";
         }
     }

}

