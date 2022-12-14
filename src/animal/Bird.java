package animal;

abstract public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("ca caaaaw");
    }

    // polymorphic argument definition:
    public static void birdSounds(Bird[] birdsArray){
        for(Bird bird: birdsArray){
            bird.makeNoise();
        }
    }


public Bird(){
    System.out.println("A bird just got constructed");
}


}// end of bird

