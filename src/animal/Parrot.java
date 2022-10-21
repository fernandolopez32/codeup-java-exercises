package animal;

public final class Parrot extends Bird{

    // final keyword is for something you do not want to be changed
    public final static String order="Psittaciforms";

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Knowledge is power");
    }

    public void echo(String input){
        System.out.println(input);
    }

    public Parrot(){
        System.out.println("A Parrot just got constructed");
    }



}// end of Parrot class
