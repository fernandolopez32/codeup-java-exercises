public class fighterTest {
    public static void main(String[] args) {
        fighter fighter1 = new fighter();
        fighter1.printStats();
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();
        fighter1.battleRoar();
        fighter1.attackRoll();
        System.out.printf("%s attacks and rolls a %d%n",fighter1.name,fighter1.attackRoll());

        fighter fighter2 = new fighter();
        fighter2.name = "Sozalix";
        fighter2.battleRoar();
    }
}
