package abstractSelfLecture;

abstract class Employee {
    protected String name;
    public String getName() {return name;}
    protected String department;
    public String getDepartment() {return department;}

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }



    public abstract String work();

    public Employee() {}
}

