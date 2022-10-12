import java.util.Scanner;

public class controlStatementsLecture {

    // statement
    // variable need to be preceded by the type declaration
    int myInteger = 20;
    public static void main(String[] args) {

        int x = 6;
        if(x == 5){
            System.out.println("x is 5");
        } else if(x > 5 && x < 15){
            System.out.println("x is between 5 and 15");
        }else {

        }

        String customerChoice;

        Scanner sc = new Scanner(System.in);
        System.out.println("What flavor would you like");
        customerChoice = sc.next().toLowerCase();
//       traditional switch statement;
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//}

        // Enhanced switch statement;

//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }

        boolean existence = true;

        if(existence) System.out.println("Yes");


        int c =0, d = 100, e = 50;
        String word1, word2, word3;


    }
}
