package collections;
import rpg.Monster;

import java.util.*;

// DATA STRUCTURES

// list Data Structures are order oriented

// ARRAY LIST is a List that is in an array style

public class ArrayListsLecture {

    public static void main(String[] args) {
        // Objects live in the HEEP
        // Reference variables live in the STACK
        // <Object> this is the data type, and it can only be an object
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19, 225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25,"Frost Giant");
        Monster goblin = new Monster(15,7,5,"Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");
        monsterArrayList.add(orc);
        // .size() is like the length of the array list
//        System.out.println(monsterArrayList.size());
        // .get(index) is to get something form the list, and you pass in the index of what you want to get
//        System.out.println(monsterArrayList.get(0));
        monsterArrayList.add(ogre);
//        System.out.println(monsterArrayList.size());
//        System.out.println(monsterArrayList.get(1));
//        System.out.println(monsterArrayList);

        // List.of() how to add multiple objects to a new array list all at once
        ArrayList<Monster> newMonsterList = new ArrayList<>(List.of(goblin,blueDragon,frostGiant,werewolf));
//        System.out.println(newMonsterList.get(1));
//        System.out.println(newMonsterList.get(1).getHitPoints()+" Hit Points");
//        System.out.println(newMonsterList);


        // add the elements of one arrayList into another arrayList
        // using the .addAll() method
//        monsterArrayList.addAll(newMonsterList);

        // if I want to add a bunch of stuff to an existing array list all at once
        monsterArrayList.addAll(new ArrayList<>(List.of(goblin,blueDragon,frostGiant,werewolf)));
        newMonsterList = monsterArrayList;
//        System.out.println(monsterArrayList);
//        System.out.println(newMonsterList);

        // loop over arrayList
        // traditional for loop
        // gives you access to the index
        for(int i= 0; i<monsterArrayList.size();i++){
            if (i == monsterArrayList.size() - 1) {
//                System.out.printf("%s%n",monsterArrayList.get(i));
            } else {
//                System.out.printf("%s, ", monsterArrayList.get(i));
            }
        }
        // Enhanced for loop no axes to index :(
        for (Monster monster : monsterArrayList) {
//            System.out.println(monster.getHitPoints());
        }

        // Object wrappers turn primitive data types into objects to be stored into an arrayList
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(2,54,23,1,78,5,-2,5));
//        System.out.println(myNumbers);
        Collections.sort(myNumbers);
//        System.out.println(myNumbers);

        ArrayList<String> randomWord = new ArrayList<>(List.of("cool","awesome", "bread", "pie"));
        Collections.sort(randomWord);
//        System.out.println(randomWord);

        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
//        System.out.println(monsterArrayList);


//        monsterArrayList.sort(new Monster());
//        System.out.println(monsterArrayList);











    } // end of main
}// end of class
