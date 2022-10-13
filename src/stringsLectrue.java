import java.util.Scanner;

public class stringsLectrue {
    public static void main(String[] args) {
        String teacher = "teacher";
        String javier = "teacher";
//        String doc = javier+teacher;
        System.out.println(teacher.hashCode());
        System.out.println(javier.hashCode());
//        System.out.println(doc);
//        System.out.println(doc.hashCode());
        teacher = "not teacher";
        System.out.println(teacher);
        System.out.println(teacher.hashCode());

        System.out.println(teacher == javier);

        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        System.out.println(javier.equals(userInput));

    }
}
