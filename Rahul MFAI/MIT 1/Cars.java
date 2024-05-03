package test;

class Vehicle {
    String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    String modelName = "Mustang";
}

public class Cars {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}