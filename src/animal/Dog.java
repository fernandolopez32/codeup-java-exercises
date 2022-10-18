package animal;

//          Create a class for your favorite type of animal. The class should be named for your animal - Cat, animal.Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeNoise(){
        System.out.printf("%s says %s",name,sound);
    }

}
