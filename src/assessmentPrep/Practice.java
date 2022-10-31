package assessmentPrep;




import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//1. Create a class called Practice with a main method.
public class Practice {
    //2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int userNumber){
        return userNumber -10;
    }
    //3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.

    public static double average (double[]numbers){
        double total = 0;
        for(double number:numbers){
            total += number;
        }
        return total/ numbers.length;
    }
    //12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers.
    // It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers){
        ArrayList<Integer> newNumbersArrayList = new ArrayList<>();
        for(int number: numbers){
            newNumbersArrayList.add(number*multiplier);
        }
        return newNumbersArrayList;
    }


    public static void main(String[] args) {

    int[] numbers ={5,3,2,1};
    ArrayList<Integer> numbersList = new ArrayList<>(List.of(3,1,5,6,7));
        System.out.println(multiplyAll(5,numbersList));

    }


}
