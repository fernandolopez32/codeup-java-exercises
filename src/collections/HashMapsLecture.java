package collections;


import rpg.Monster;

import java.util.HashMap;

// data structure where a vale is stored in a bucket and is referenced by a string usually
public class HashMapsLecture {
    public static void main(String[] args) {


        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19, 225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25,"Frost Giant");
        Monster goblin = new Monster(15,7,5,"Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");

        HashMap <String,Monster> monsterHashMap = new HashMap<>();


    }// end of main
}// end of HashMaps
