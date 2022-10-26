package groceries;

import util.Input;

public class GroceryListApplication {

    public static void main(String[] args) {


        Input input = new Input();
        GroceryList groceryList = new GroceryList();

        boolean userMakeList = input.yesNo("Would you like to create a grocery list?");
        if(userMakeList){
            boolean newItem = input.yesNo("Would you like to enter a new item?");
            if(newItem){
                input.getString("What Category of food are you looking for?");
            }
        }

    }
}
