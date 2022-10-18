package rpg;

public class Fighter {

    // instance variables
public String name;
public int hitPoints;
public int maxDamage;

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
