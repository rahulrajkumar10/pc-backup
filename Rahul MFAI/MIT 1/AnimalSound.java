package test;

class Animal{
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();
    }

}