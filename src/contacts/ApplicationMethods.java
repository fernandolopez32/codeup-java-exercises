package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationMethods {
    static Input input = new Input();
    static Path p = Paths.get("src","text", "text.txt");

    public void promptUser() {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "whatever";

        while (!userChoice.equals("5")) {
            System.out.println("What would you like to do");
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact");
            System.out.println("3 - Search a contact by name.");
            System.out.println("4 - Delete an existing contact.");
            System.out.println("5 - Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5 ");
            userChoice = scanner.next();

            switch (userChoice) {
                case "1" -> viewContacts();
                case "2" -> addNewContact();
                case "3" -> searchContact();
                case "4" -> deleteContact();
                case "5" -> System.out.println(5);

                default -> {
                    System.out.println("Wrong input you Dummy");
                    promptUser();
                }
            }
        }
    }

    public static void viewContacts (){

        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String contacts : lines){
            System.out.println(contacts);
        }
    }

    public static void addNewContact(){
        String userInput = input.getString("Enter Contact name and Phone Number");
        List<String> contact = new ArrayList<>();
        contact.add(userInput);
        try {
            Files.write(p, contact, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchContact (){
        List<String> lines = new ArrayList<>();
        String userSearch = input.getString("Enter name to search:...");
        try{
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String contacts : lines){
            if(contacts.equals(userSearch))
                System.out.println("here you go: "+contacts);
        }
    }

    public static void deleteContact(){
        String toBeDeleted = input.getString("What contact would you like to delete?");
        List<String> updatedNames = new ArrayList<>();
        for(String name: readLines()){
            if(!name.contains(toBeDeleted)){
                updatedNames.add(name);
            }
        }
        writeLines(updatedNames);
    }

    private static void writeLines(List<String> lines) {
        try {
            Files.write(p, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    public static void newContactInstance(){
        String name = input.getString();
        String number = input.getString();
        Contact whatever = new Contact(name,number);
    }


}
