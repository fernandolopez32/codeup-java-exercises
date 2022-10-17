
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static double add(double val, double val2){
        return  val + val2;
    }
    public static double subtract(double val, double val2){
        return val - val2;
    }
    public static double multiply(double val, double val2){
        return val * val2;
    }
    public static double divide(double val, double val2){
        return val / val2;
    }
    public static int withinRange(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number from %d to %d %n", min,max);
        int userInput = sc.nextInt();

        if(userInput < min || userInput > max){
            System.out.println("Invalid input, try again");
            return withinRange(min,max);
        } else {
            return userInput;
        }
    }
    public static int factorial(int min, int max){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d %n", min,max);
        int userInput = sc.nextInt();
        System.out.println("do you want to continue y/n?: ");
        String userChoice = sc.nextLine();

        if(userInput < min || userInput > max){
            return factorial(min,max);
        }
        int factor = 1;
            for (int i =1; i<userInput+1; i++){
                System.out.printf("%d! %n" ,i);
                factor *= i;
            }
            return factor;
    }
    public static long jFactorial() {
        int userInput = withinRange(1, 10);
        while (true) {
            long factorial = 1;
            for(int i = 1; i<= userInput; i++){
                factorial = factorial * i;
            }
            System.out.println("calculate another factorial? y/n %n");
            String usersChoice = new Scanner(System.in).next();


            if (usersChoice.equalsIgnoreCase("n")) {
                return factorial;
            } else {
                jFactorial();
            }
        }
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
    public static int generateRandomNumber(int max){
        return (int)Math.ceil(Math.random()* max);
    }
    public static void rolldDice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many sides does the dice have?");
        byte numberOfSides = sc.nextByte();
        System.out.printf("Your dice have %d sides. %n", numberOfSides);
        System.out.println("Would you like to roll the dice? y/n:");
        String userChoice = sc.next();
        if(userChoice.contains("y")){
            System.out.println("you rolled the dice!");
            System.out.printf("you rolled %d and a %d %n",generateRandomNumber(numberOfSides),generateRandomNumber(numberOfSides));
        }
        System.out.println("Do you want to roll the dice again?");
        if(sc.nextLine().equals("y"))rolldDice();

    }

public static void highLowGame(){

}


    public static void main(String[] args) {
//        System.out.println(add(4,4));
//        System.out.println(subtract(3,3));
//        System.out.println(multiply(3,4));
//        System.out.println(divide(3,3));
//        int userInput = withinRange(2,9);
//        System.out.println(factorial(1,10));
//        System.out.printf("%1.0f",dice(1));

        rolldDice();

    }// end of main
}// end of MethodExercise


