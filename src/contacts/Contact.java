package contacts;

import util.Input;

public class Contact {
    static Input input = new Input();
    private static String Name;

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    private static String Number;

    public static String getNumber() {
        return Number;
    }

    public static void setNumber(String number) {
        Number = number;
    }

    public Contact() {
        String name = input.getString("Enter new contact's name:");
        String number = input.getString("Enter new contact's phone number:");
    }

    public Contact(String name, String number){
        setNumber(number);
        setName(name);
    }



}
