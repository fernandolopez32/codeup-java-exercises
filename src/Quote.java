
//  Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.
public class Quote {

    public static int randomNumber(){
        return (int) Math.ceil(Math.random()*4);
    }
    public static String randomeQuote(){
        if(randomNumber() == 1){
            return "Fortune favors the bold.";
        } else if(randomNumber() == 2){
            return "I think, therefore I am.";
        }else if(randomNumber() == 3) {
            return "Time is money.";
        } else {return "Knowledge is power.";}


    }

    public static void main(String[] args) {
        System.out.println(randomeQuote());
    }



}
