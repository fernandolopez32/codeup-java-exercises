public class EmployeeTest {
    public static void main(String[] args) {
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
        System.out.println(Employee.company == "nachos");


    }
}
