package com.John;

public class Vehicle {

    private String color;
    private int engine;
    private int passengers;

    public Vehicle(String color, int engine, int passengers) {
        this.color = color;
        this.engine = engine;
        this.passengers = passengers;
    }

    public String getColor() {
        return color;
    }

    public int getEngine() {
        return engine;
    }

    public int getPassengers() {
        return passengers;
    }
}
