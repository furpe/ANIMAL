package model;

import enums.Habitat;

public class Dog extends Animal {

    private String breed;
    private boolean isVaccinated;
    private TrainingLevel trainingLevel;
    private String ownerName;
    private int barkVolume;

    public Dog(String name, int age, double weight, Habitat habitat, boolean iswild, String breed, boolean isVaccinated, TrainingLevel trainingLevel, String ownerName, int barkVolume) {
        super(name, age, weight, speed:48, Habitat.DOMESTIC
        , iswild:
        false
        );
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.trainingLevel = trainingLevel;
        this.ownerName = ownerName;
        this.barkVolume = barkVolume;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof woof!(" + barkVolume + " dB)");
    }

    public void move(String direction) {
        System.out.println(getName() + " runs towards the " + direction);
    }

    public void move(int distance, String fetchTarget) {
        System.out.println(getName() + " sprinted " + distance + " meters to fetch the " + fetchTarget);
    }

    public void fetch(String item) {
        System.out.println(getName() + " fetches the " + item + "and brought it back!");
    }

    public String getBreed() {
        return breed;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public int getBarkVolume() {
        return barkVolume;
    }

    public TrainingLevel getTrainingLevel() {
        return trainingLevel;
    }
}
