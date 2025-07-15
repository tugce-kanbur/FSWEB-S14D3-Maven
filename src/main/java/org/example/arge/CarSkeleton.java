package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine(){
        return getClass().getSimpleName();
    }
    public String drive(){
        return runEngine();
    }
    protected String runEngine(){
        return getClass().getSimpleName();
    }
}
