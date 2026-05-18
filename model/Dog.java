package model;

import enums.Habitat;

public class Dog extends Animal {
    private String breed;
    private boolean isvaccinated;
    private TrainingLevel trainingLevel;
    private String ownerName;
    private int barkVolume;

    public Dog(String name, int age, int speed, double weight, Habitat habitat, boolean iswild, String breed) {
        super(name, age, speed, weight, habitat, iswild);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }

    public String getBreed() {
        return breed;
    }
    
}
