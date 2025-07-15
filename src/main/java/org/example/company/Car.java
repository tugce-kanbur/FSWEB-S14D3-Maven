package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        String message = getClass().getSimpleName() + ": the car's engine is starting";
        System.out.println(message);
        return "the car's engine is starting";
    }

    public String accelerate() {
        String message = getClass().getSimpleName() + ": the car is accelerating";
        System.out.println(message);
        return "the car is accelerating";
    }
    public String brake(){
        String message = getClass().getSimpleName() + ": the car is braking";
        System.out.println(message);
        return "the car is braking";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }


    @Override
    public String toString() {
        return "Car{" +
                ", name='" + name + ", cylinders=" + cylinders +
                '}';
    }

}
