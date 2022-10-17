import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("Whats up im bob...");
        do {
            userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine be that way");
            }else if (userInput.contains("computers") & userInput.contains("over the world")) {
                System.out.println("Its inevitable that computer take over the world...");
            } else {
                System.out.println("Whatever");
            }

        }while (!userInput.equals("okay bye"));
        System.out.println("bye dude");

//        switch (userInput) {
//            case userInput.contains("hey") -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }



    }
}
