package rpg;

public class fighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.printStats();
        fighter1.setName("Aratra");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(13);
        fighter1.printStats();
        fighter1.battleRoar();
        fighter1.attackRoll();
        System.out.printf("%s attacks and rolls a %d%n", fighter1.getName(),fighter1.attackRoll());

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.battleRoar();
        System.out.println(club.maxDamage);

        Fighter fernando = new Fighter("Fernando",100,100);
        fernando.printStats();


    }
}


