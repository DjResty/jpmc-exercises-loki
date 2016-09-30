package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Animal {

    private boolean animalExtinct;
    private int numberOfAnimals;
    private String animalType;

    public boolean isAnimalExtinct() {
        return animalExtinct;
    }

    public void setAnimalExtinct(boolean animalExtinct) {
        this.animalExtinct = animalExtinct;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
