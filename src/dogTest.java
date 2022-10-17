public class dogTest {
    public static void main(String[] args) {
        Dog pet = new Dog();
        pet.name = "Whiskey";
        pet.sound = Quote.randomeQuote();
        pet.makeNoise();
    }
}

