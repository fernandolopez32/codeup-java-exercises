import java.util.Arrays;

public class ArraysExercises {









    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] persons = new Person[3];

        persons[0] = new Person("fernando");
        persons[1] = new Person("david");
        persons[2] = new Person("Aaron");

        for (Person person : persons) {
            System.out.println(person.getName());
        }


    }// end of main
}// end of class
