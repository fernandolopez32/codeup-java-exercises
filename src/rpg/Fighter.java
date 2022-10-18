package rpg;

public class Fighter {

    // instance variables
private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
private int hitPoints;
    // setter
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    // getter == set to public
    public int getHitPoints(){
        return hitPoints;
    }
private int maxDamage;

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    // instance methods
    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n",name,hitPoints,maxDamage);
    }
    public void battleRoar(){
        System.out.printf("I am %s and I will destroy you%n",name);
    }
    public int attackRoll(){
        return D20.rolld20();
    }
    // no arg constructor
    public Fighter(){

    }

    // overloaded constructor
    public Fighter(String name, int hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }
}
