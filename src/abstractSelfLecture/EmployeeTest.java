package abstractSelfLecture;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee tim = new Accountant();
        Employee fern = new Developer();
        System.out.println(fern.work());

    }
}
