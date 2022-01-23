package java4HomeWork;

public class AnimalPropertiesHomeWork {
    public static void main(String[] args) {

        Animal cat = new Animal("Leonsio", false, true, false, 4);
        Animal pig = new Animal("Pjatochok", false, true, false, 4);
        Animal horse = new Animal("Bulat", false, false, false, 4);
        Animal penguin = new Animal("Shljop", true, false, false, 4);
        Animal dolphin = new Animal("Ecco", false, true, false, 4);
        Animal dog = new Animal("Bill", false, true, false, 4);

        horse.sleepCommand();
        horse.feedCommand();
        horse.walkingCommand();
        horse.playCommand();
        horse.trainCommand();
        horse.playCommand();
        horse.walkingCommand();
        horse.feedCommand();
        horse.walkingCommand();



    }


}
