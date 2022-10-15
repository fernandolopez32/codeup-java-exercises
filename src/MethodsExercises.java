import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {


    public static int add(int val, int val2){
        return  val + val2;
    }
    public static int subtract(int val, int val2){
        return val - val2;
    }
    public static int multiply(int val, int val2){
        return val * val2;
    }
    public static int divide(int val, int val2){
        return val / val2;
    }

    public static int withinRange(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number from %d to %d %n", min,max);
        int userInput = sc.nextInt();

        if(userInput < min || userInput > max){
            System.out.println("Input number again");
            return withinRange(min,max);
        } else {
            return userInput;
        }
    }
    public static int factorial(int min, int max){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number from %d to %d %n", min,max);
        int userInput = sc.nextInt();

        int factor = 1;
            for (int i =1; i<userInput+1; i++){
                System.out.printf("%d!%n",i);
                factor *= i;
            }
            return factor;
    }

    public static void main(String[] args) {
//        System.out.println(add(4,4));
//        System.out.println(subtract(3,3));
//        System.out.println(multiply(3,4));
//        System.out.println(divide(3,3));
//        System.out.println(withinRange(1,10));


        System.out.println(factorial(1,10));




    }// end of main
}// end of MethodExercise
