package assessmentPrep;

public class PetDog extends Pet implements Companion{
    boolean isTrained;

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public PetDog(String name, String type, boolean isTrained) {
        super(name, type);
        this.isTrained = isTrained;
    }

    @Override
    public String snuggle() {
       return getName()+" wants to snuggle";
    }
}
