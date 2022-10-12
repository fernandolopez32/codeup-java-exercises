
import java.util.Scanner;

public class consoleIOLecture {
    public static void main(String[] args) {
//        String cohort ="Weywot";
//        String timeOfDay = "morning";
//        byte week = 10;
//        float someNumber = 123.456F;
//        System.out.printf("Good, %s %s welcome to our %dth week!%n",timeOfDay,cohort,week);
//        System.out.println("Will this be a separate line?");
//        System.out.println("How about this?");
//        System.out.printf("The number is %012.3f%n",someNumber);
//        System.out.printf("The number is %-11.2f test %n",someNumber);

        Scanner scanner = new Scanner(System.in);


        System.out.printf("Enter a number: %n");
        int userNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("Your favorite number is %d %n",userNumber);

//        String ghost = scanner.nextLine();

//        scanner.nextLine();

//        String userInput = scanner.next() + scanner.nextLine();

        System.out.println("Enter a word: ");
        String userInput = scanner.nextLine();
        System.out.printf("Your word was %s.%n", userInput);




    }
}
