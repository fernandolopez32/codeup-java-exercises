import org.w3c.dom.ls.LSOutput;

import javax.management.loading.MLet;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        String userString = "";
//        while(i <= 15){
//            userString += i+" ";
//            i++;
//        }
//        System.out.println(userString);

//        for(int i = 0; i<= 15; i++){
//            String acc = "";
//            acc += i;
//            System.out.println(acc);
//        }

//        long i =2;
//        do{
//            System.out.println(i);
//            i*=i;
//
//        } while(i < 1000000);

//        for(long i = 2; i <= 65536; i*=i){
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);



//        System.out.println("What number would you like to go to?");
//        int userNumber = sc.nextInt();
//        sc.nextLine();
//        String userContinue = "yes";
//
//        while (userContinue.equals("yes")||userContinue.equals("y")) {
//            System.out.println("Here is your table!\n\n number | squared | cubed \n\n ------ | ------- | -----");
//            for (int i = 1; i <= userNumber; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
////                System.out.println(i + "       | " + square + "       |  " + cubed);
//                System.out.printf("%-7d | %-7d | %-5d %n",i,square,cubed);
//                }
//            System.out.println("Would you like to continue? Yes/No");
//            userContinue = sc.nextLine().toLowerCase();
//            if(userContinue.equals("no")||userContinue.equals("n")){break;}
//            System.out.println("To what number would you like to count now?");
//            userNumber = sc.nextInt();
//            sc.nextLine();
//            }


        String userChoice = "y";
        while(userChoice.equals("y")) {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            byte grade = sc.nextByte();
            char letterGrade;
            if (grade >= 0 && grade <= 59) {
                letterGrade = 'F';
            } else if (grade > 59 && grade <= 66) {
                letterGrade = 'D';
            } else if (grade > 66 && grade <= 79) {
                letterGrade = 'C';
            } else if (grade > 79 && grade <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is " + letterGrade);
            System.out.println("would youlike to enter another grade?");
            userChoice = sc.next();
        }


        }
    }

