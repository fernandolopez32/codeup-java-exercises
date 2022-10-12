import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %3.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        System.out.println("Hey you, enter an integer here:");
//        int userInt = scanner.nextInt();
//        System.out.printf("You entered %d%n",userInt);
//        scanner.nextLine();
//
//        System.out.println("Enter three words");
//        String word1 = scanner.next();
//
////        System.out.println("Enter another word");
//        String word2 = scanner.next();
//
////        System.out.println("Enter a word one last time");
//        String word3 = scanner.next();
//
//        System.out.printf("Here are your words: %n%s%n%s%n%s%n",word1,word2,word3);
//        scanner.nextLine();
//        System.out.println("Enter a sentence here:");
//        String userSentence = scanner.nextLine();
//        System.out.printf("Was this your sentence?%n%s%n",userSentence);
        System.out.println("Enter length:");
        float length = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter width:");
        float width = Float.parseFloat(scanner.nextLine());
        float area = length*width;
        float perimeter = length*2 + width*2;
        System.out.println("Enter height: ");
        float height = Float.parseFloat(scanner.nextLine());
        float volume = width * length * height;


        System.out.printf("The rooms Area is %.2f and your perimeter is %.2f %n",area,perimeter);
        System.out.printf("The volume of your room is %.2f",volume);

    }
}
