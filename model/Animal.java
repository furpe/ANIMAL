package model;

import enums.Habitat;

public abstract class Animal{
    private String name;
    private int age;
    private int speed;
    private double weight;
    private Habitat habitat;
    private boolean iswild;
    

    public Animal(String name, int age, int speed, double weight, Habitat habitat, boolean iswild) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.habitat = habitat;
        this.iswild = iswild;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void move(int distance) {
        System.out.println(name + " moved " + "meters at" + speed + " km/h.");
    }

    public void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat.getDisplayname());
        System.out.println("Is Wild: " + (iswild ? "Yes" : "No"));
    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public boolean isIswild() {
        return iswild;
    }  

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {  
        this.weight = weight;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
    
    public void setIswild(boolean iswild) {
        this.iswild = iswild;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}