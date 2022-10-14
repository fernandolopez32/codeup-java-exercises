import java.util.Scanner;

public class stringsLectrue {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        String javier = "Javier";
//        String alsoJavier = "Javier";
//        String doc = javier+teacher;
//        System.out.println(teacher.hashCode());
//        System.out.println(javier.hashCode());
////        System.out.println(doc);
////        System.out.println(doc.hashCode());
//        teacher = "not teacher";
//        System.out.println(teacher);
//        System.out.println(teacher.hashCode());
//
//        System.out.println(teacher == javier);

        String javier = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        String alsoJavier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        javier = javier +" Ruedas";
        alsoJavier = javier;

        System.out.println(alsoJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

        String letsTryThis = "Javier";
        System.out.println(Integer.toHexString(System.identityHashCode(letsTryThis)));

        String theOriginalJavier = "Javier";
        System.out.println(letsTryThis == theOriginalJavier);

        System.out.println("Whats your name");
        String username = sc.nextLine();
        //When comparing String values you need .equals
        // If you use == it will compare the .identityHashCode
        System.out.println(Integer.toHexString(System.identityHashCode(username)));
        System.out.println(alsoJavier.equals(username));



    }// end of main
}// end of stringLecture
