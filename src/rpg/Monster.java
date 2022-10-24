package rpg;

public class Monster {
//        implements Comparable<Monster> {

    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString(){
        return name;
    }

//    public static void generateMonster(){
//        Monster orc = new Monster(13,15,9,"Orc");
//        Monster ogre = new Monster(11,59,13,"Ogre");
//        Monster blueDragon = new Monster(19, 225,23,"Blue Dragon");
//        Monster frostGiant = new Monster(15,138,25,"Frost Giant");
//        Monster goblin = new Monster(15,7,5,"Goblin");
//        Monster werewolf = new Monster(11,58,7,"Werewolf");
//    }
    public Monster(){}

    public Monster(int armorClass, int hitPoints, int damage, String name) {
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.name = name;
    }

//    @Override
//    public int compareTo(Monster m1, Monster m2){
//            return Integer.compare(m2.getHitPoints(), m1.getHitPoints());
//        }


    }// end of monster

