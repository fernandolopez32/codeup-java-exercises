package groceries;

import util.Input;

public class GroceryListApplication {

    public static void main(String[] args) {


        Input input = new Input();
        boolean userMakeList = input.yesNo("Would you like to create a grocery list?");
        if(userMakeList){
            boolean newItem = input.yesNo("Would you like to enter a new item?");
            if(newItem){
                System.out.println("categories");
            }
        }

    }
}
