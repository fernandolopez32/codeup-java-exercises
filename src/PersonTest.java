public class PersonTest {
    public static void main(String[] args) {
        Person Fernando = new Person("Fernando");
        System.out.println(Fernando.getName());
        Fernando.sayHello();
        Fernando.setName("not my name");
        Fernando.sayHello();




    }
}
