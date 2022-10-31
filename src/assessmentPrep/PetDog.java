package assessmentPrep;

public class PetDog extends Pet {
    boolean isTrained;

    public PetDog(String name, String type, boolean isTrained) {
        super(name, type);
        this.isTrained = isTrained;
    }
}
