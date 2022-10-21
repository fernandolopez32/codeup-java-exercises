package abstractSelfLecture;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee tim = new Accountant();
        Employee fern = new Manager();
        System.out.println(fern.work());
        Developer ferny = new Developer();
        ferny.drinkCoffee();
        ferny.writeCode(33);


    }
}
