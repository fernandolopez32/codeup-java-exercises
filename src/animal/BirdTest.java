package animal;

public class BirdTest {
    public static void main(String[] args) {
        Bird crow = new Bird();
        crow.setName("Dr.Crow");
        System.out.print(crow.getName()+" goes");
        crow.makeNoise();

        TweetyBird goldfinch = new TweetyBird();
        goldfinch.makeNoise();

        Parrot parrot = new Parrot();
        parrot.makeNoise();

    }

}// end of bird test class
