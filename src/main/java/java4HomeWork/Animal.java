package java4HomeWork;

public class Animal {
    public String fieldName;
    public boolean fieldGotWings;
    public boolean fieldEatMeat;
    public boolean fieldSleep;
    public int fieldEnergyLevel;

    public Animal() {
    }

    public Animal(String name, boolean gotWings, boolean eatMeat, boolean sleep, int energyLevel) {
        fieldName = name;
        fieldGotWings = gotWings;
        fieldEatMeat = eatMeat;
        fieldSleep = sleep;
        fieldEnergyLevel = energyLevel;
    }

    public Animal(String name) {
        fieldName = name;
    }

    public void sleepCommand() {
        fieldSleep = true;
        System.out.println(fieldName + " goes to sleep");
    }

    public void feedCommand() {
        if (fieldEnergyLevel <= 3) {
            fieldEnergyLevel = 4;
            System.out.println(fieldName + " goes to eat energy = " + fieldEnergyLevel);
        } else if (fieldEnergyLevel == 4) {
            System.out.println(fieldName + " is not hungry");
        }
    }

    public void walkingCommand() {
        if (fieldEnergyLevel >= 1 && fieldEnergyLevel <= 4) {
            fieldEnergyLevel--;
            System.out.println(fieldName + " goes walking, energy = " + fieldEnergyLevel);
        } else if (fieldEnergyLevel == 0) {
            System.out.println(fieldName + " too tired to walking and hungry, need to feed.");
        }

    }

    public void playCommand() {
        if (fieldEnergyLevel >= 1 && fieldEnergyLevel <= 4) {
            fieldEnergyLevel--;
            System.out.println(fieldName + " goes to play, energy = " + fieldEnergyLevel);
        } else if (fieldEnergyLevel == 0) {
            System.out.println(fieldName + " too tired to play and hungry, need to feed.");
        }
    }

    public void trainCommand() {
        if (fieldEnergyLevel >= 1 && fieldEnergyLevel <= 4) {
            fieldEnergyLevel--;
            System.out.println(fieldName + " goes to train, energy = " + fieldEnergyLevel);
        } else if (fieldEnergyLevel == 0) {
            System.out.println(fieldName + " too tired to train and hungry, need to feed.");
        }
    }
}
