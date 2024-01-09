package com.constructer.demo;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal from constructer name: " + name);
    }

    void makeSound() {
        System.out.println("some generic sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog Details  from Dog constructor " + name + " (" + breed + ")");
    }

    void makeSound() {
        System.out.println("Dog sound :" + "Bhaw" + "Bhaw");
    }

}

public class TestClassEx {
    public static void main(String[] args) {
        Dog dog = new Dog("Leo", "German");
    }
}
