import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[4];

            people[0] = new Person("fernando");
            people[1] = new Person("david");
            people[2] = new Person("Aaron");
            people[3] = new Person("Mason");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person dan = new Person("Daniel");

        people = ArraysExercises.addPerson(people, dan);

        System.out.println(Arrays.toString(people));

        for (Person person: people){
            System.out.println(person.getName());
        }



    }// end of main
}// end of ArraysTest class
