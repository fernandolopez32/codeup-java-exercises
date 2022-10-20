package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }


    public String getString(){
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("yes or no?");
        String userInput = scanner.next().toLowerCase();
        return userInput.equalsIgnoreCase("y")||userInput.equalsIgnoreCase("yes");
    }

    public int getInt(){
        System.out.println("Enter an Integer:");
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number from %d to %d %n", min,max);
        int userInput = scanner.nextInt();

        if(userInput < min | userInput > max){
            System.out.printf("%d is not within the range bro%n",userInput);
            return getInt(min,max);
        } else{ return userInput;}
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        int min = getInt();
        int max = getInt();
        System.out.printf("Your parameters are from %d to %d %n", min,max);
        int userInput = scanner.nextInt();

        if(userInput < min | userInput > max){
            System.out.printf("%d is not within the range bro%n",userInput);
            return getInt(min,max);
        } else{ return userInput;}
    }

    public double getDouble(){
       return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
       return scanner.nextDouble();
    }


    // recursive if the number is within the range
    public double getDouble(double min, double max){
        System.out.printf("Enter a number from %f to %f %n", min,max);
        double userInput = scanner.nextDouble();

        if(userInput < min || userInput > max){
            return getDouble(min,max);
        } else{ return userInput;}

    }



public Input(){
        scanner = new Scanner(System.in);
}



//    private static Scanner scanner = new Scanner(System.in);
//
//    public static String getString(){
//        String potatoes = scanner.nextLine();
//        System.out.println(potatoes);
//        return potatoes;
//    }
//
//    public static boolean yesNo(){
//        String userInput = getString().toLowerCase();
//        if(userInput.contains("y")) {
//            System.out.println("true");
//            return true;
//        }
//        else {
//            System.out.println("false");
//        }
//        return true;
//    }
//
//    public static int getInt(int min, int max){
//        System.out.printf("Enter a number from %d to %d %n", min,max);
//        int userInput = scanner.nextInt();
//
//        if(userInput < min || userInput > max){
//            System.out.printf("%d is your number %n",userInput);
//            return userInput;
//        } else{ return getInt(min,max);}
//    }
//
//    public static double getDouble(double min, double max){
//        System.out.printf("Enter a number from %f to %f %n", min,max);
//        double userInput = scanner.nextDouble();
//
//        if(userInput < min || userInput > max){
//            System.out.printf("%.2f is your number %n",userInput);
//            return userInput;
//        } else{ return getDouble(min,max);}
//
//    }
//
//    public static int getInt(){
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//        return userInput;
//    }
//
//



}// end of Input class

