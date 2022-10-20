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

            Person[] people3 = {new Person("tony"), new Person("javi")};

        for (Person person : people) {
            System.out.println(person.getName());
        }
        people = ArraysExercises.addPerson(people,"Daniel");

        System.out.println(Arrays.toString(people));

        for (Person person: people){
            System.out.println(person.getName());
        }



    }// end of main
}// end of ArraysTest class
