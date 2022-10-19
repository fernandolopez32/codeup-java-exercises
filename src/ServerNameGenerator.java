import java.util.Random;

public class ServerNameGenerator {

    String[] adjectives = {"beautiful","smooth","heavy","hot","cold","new","old","dirty","wet","big"};

    String[] nouns = {"city","ball","cat","dog","cow","snake","potato","apple","duck","house"};
    public static String randomString (String[] array){
        Random generator = new Random();
        String randomIndex = String.valueOf(generator.nextInt(array.length));
        return randomIndex;
    }

}
