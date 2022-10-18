public class EmployeeTest {
    public static void main(String[] args) {
    //  reference variable = new object
    //                       new is the keyword to invoke a constructor
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.name = "pablo";
        employee2.name = "pancho";
        employee3.name = "paco";
        System.out.println(employee1.displayEmployeeIfo());
        System.out.println(employee2.displayEmployeeIfo());
        System.out.println(employee3.displayEmployeeIfo());
        Employee.company = "nachos";
        System.out.println(Employee.company);
        Employee Fernando = new Employee(1,"Fernando");
        System.out.println(Fernando.displayEmployeeIfo());
        System.out.println(Fernando);


    }
}
