import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob here:");
        String userInput = sc.nextLine();
//        while (!userInput.equals("im done")) {
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine be that way");
            } else {
                System.out.println("Whatever");
            }
//        }

//        switch (userInput) {
//            case userInput.endsWith -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }



    }
}
