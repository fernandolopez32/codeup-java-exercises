package collections;


import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

// data structure where a vale is stored in a bucket and is referenced by a string usually
public class HashMapsLecture {
    public static void main(String[] args) {


        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19, 225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25,"Frost Giant");
        Monster goblin = new Monster(15,7,5,"Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");
        Monster orcWarChief = new Monster(16,93,15,"Orc War Chief");

        // create a new Hash Map defining the key and value data types between angle brackets
        HashMap <String,Monster> monsterHashMap = new HashMap<>();

        // add a key value pair to the hashmap using .put()
        monsterHashMap.put("orc",orc);

        // access a value in the hashmap using .get()
//        System.out.println(monsterHashMap.get("orc").getHitPoints());
//        System.out.println(monsterHashMap.get("orc"));


        // replace a value in the hash map using .replace()
        monsterHashMap.remove("orc",orcWarChief);

        // to add multiple objects to Hashmap at once use Map.ofEntries()
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("orc",orc),
                entry("blue dragon",blueDragon),
                entry("ogre",ogre),
                entry("werewolf",werewolf),
                entry("frost giant",frostGiant),
                entry("goblin",goblin),
                entry("orc war chief",orcWarChief)
        );

        monsterHashMap.putAll(intermediateMap);

        System.out.println(monsterHashMap.get("frost giant").getHitPoints());

        // looping through hash map
        // use .entrySet to derive a set of entries
        // each entry is represented as a Map.Entry<dataTypeOfKey, dataTypeOfValue>
        // once you have an entry you can use an enhanced for loop
        System.out.println("------------loop over entry set");
        for(Map.Entry<String,Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d and armor class of %d  and does %d damage %n", monster,monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        //To create a list of specific properties in the objects stored as HashMap values , we can use .keSet().stream().toList()

        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
        // once I have a list I can sort it and do other list things to it
        Collections.sort(monsterNames);
        System.out.println(monsterNames);

        // The strings generated form the keyset are the keys to the HashMap
        // looping over this list allows me to access all te hasMap entries

        System.out.println("-----------loop over keyset converted to a list");
        for(String monsterName: monsterNames){
            Monster monster = monsterHashMap.get(monsterName);
            System.out.printf("The %s has %d and armor class of %d  and does %d damage %n", monster,monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        // forEach loop

        System.out.println("----------forEach");
        monsterHashMap.forEach((key,monster) -> {
            System.out.printf("The %s has %d and armor class of %d  and does %d damage %n", monster,monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        // convert to tree map to sort by key
        System.out.println("----------tree map forEach");
        Map<String,Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
        monsterTreeMap.forEach((key,monster) -> {
            System.out.printf("The %s has %d and armor class of %d  and does %d damage %n", monster,monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        Object[] monstersArray = monsterHashMap.values().toArray();
        for(Object monster: monstersArray){
            int hitPoints = ((Monster) monster).getHitPoints();
            System.out.println(hitPoints);
        }


        Monster[] monstersArray2 = monsterHashMap.values().toArray(new Monster[0]);
        for (Monster monster: monstersArray2){
            System.out.println(monster.getName()+" has " + monster.getHitPoints());
        }


    }// end of main
}// end of HashMaps
