package animal;

public class Parrot extends Bird{

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Knowledge is power");
    }

    public void echo(String input){
        System.out.println(input);
    }




}// end of Parrot class
