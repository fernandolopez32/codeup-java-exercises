package animal;

public class TweetyBird extends Bird {
    // Overriding: a subclass redefines one of its inherited methods when it needs to change or extend the behavior of the method
    public void makeNoise(){
        System.out.println("Tweet tweet");
    }
}
