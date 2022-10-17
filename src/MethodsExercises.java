
import java.util.Random;
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
            System.out.println("Invalid, try again");
            return withinRange(min,max);
        } else {
            return userInput;
        }
    }
    public static int factorial(int min, int max){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d %n", min,max);
        int userInput = sc.nextInt();


        if(userInput < min || userInput > max){
            System.out.println("do you want to continue");
            return factorial(min,max);
        }
        int factor = 1;
            for (int i =1; i<userInput+1; i++){
                System.out.printf("%d! %n" ,i);
                factor *= i;
            }
            return factor;
    }

//    public static int factor(int userInput){
//        Scanner sc = new Scanner(System.in);
//        userInput = sc.nextInt();
//        int acc = 1;
//        for(int i = 1; i<userInput+1; i++){
//            acc *= i;
//        }
//        return acc;
//    }

    public static double dice(int sides){
        Scanner sc = new Scanner(System.in);
        String userResponse;
        double roll = 0;
        double roll2 = 0;

        do {
            System.out.println("How manny sides do your dice have?");
            sides = sc.nextInt();

            System.out.println("Do you want to roll the dice?");
            userResponse= sc.next();
            roll = (Math.random() * sides + 1);
            roll2 = (Math.random() * sides + 1);
            System.out.printf("%1.0f and %1.0f are your numbers! %n",roll,roll2);

        }
        while (userResponse.contains("y"));


        return roll;
    }

    public static void main(String[] args) {
//        System.out.println(add(4,4));
//        System.out.println(subtract(3,3));
//        System.out.println(multiply(3,4));
//        System.out.println(divide(3,3));
//        int userInput = withinRange(2,9);
//        System.out.println(factorial(1,10));
        System.out.printf("%1.0f",dice(1));



    }// end of main
}// end of MethodExercise
