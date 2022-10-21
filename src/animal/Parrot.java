package animal;

public final class Parrot extends Bird implements Pet{

    // final keyword is for something you do not want to be changed
    public final static String order="Psittaciforms";

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Knowledge is power");
    }

    public void echo(String input){
        System.out.println(input);
    }



    @Override
    public void beCute() {
        System.out.println("Human goes awwwwww");
    }

    public Parrot(){
        System.out.println("A Parrot just got constructed");
    }

    public Parrot(String name){

    }

}// end of Parrot class
