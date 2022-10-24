package collections;
import rpg.Monster;

import java.util.ArrayList;
import java.util.List;

// DATA STRUCTURES

// list Data Structures are order oriented

// ARRAY LIST is a List that is in an array style

public class CollectionsLecture {

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
        System.out.println(monsterArrayList.size());
        // .get(index) is to get something form the list, and you pass in the index of what you want to get
        System.out.println(monsterArrayList.get(0));
        monsterArrayList.add(ogre);
        System.out.println(monsterArrayList.size());
        System.out.println(monsterArrayList.get(1));
        System.out.println(monsterArrayList);

        // List.of() how to add multiple objects to an array list all at once
        ArrayList<Monster> newMonsterList = new ArrayList<>(List.of(goblin,blueDragon,frostGiant,werewolf));
        System.out.println(newMonsterList.get(1));
        System.out.println(newMonsterList.get(1).getHitPoints()+" Hit Points");

        //
        monsterArrayList.addAll(newMonsterList);
        newMonsterList = monsterArrayList;

    }
}
