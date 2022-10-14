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
            }else if (userInput.equals("Will computers take over the world?")) {
                System.out.println("Its inevitable");
            } else {
                System.out.println("Whatever");
            }

        }while (!userInput.equals("okay bye"));
        System.out.println("bye dude");

//        switch (userInput) {
//            case userInput.endsWith -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }



    }
}
