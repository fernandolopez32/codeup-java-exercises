import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] oldArray,Person person){
        Person [] NewArray = new Person[oldArray.length+1];

        for(int i=0; i < oldArray.length; i++){
                NewArray[i] = oldArray[i];
                if(i == oldArray.length-1){
                    NewArray[NewArray.length -1] =  person;
                }
        }
        return NewArray;
    }



}// end of class
