package com.John;

public class Car extends Vehicle {

    private String make;
    private int wheels;
    private int windows;
    private int year;
    private int doors;
    private int speed;
    private int gear;

    public Car(String color, int engine,
               int passengers, String make,
               int wheels, int windows,
               int year, int doors, int speed, int gear) {
        super(color, 1, passengers);
        this.make = make;
        this.wheels = wheels;
        this.windows = windows;
        this.year = year;
        this.doors = doors;
        this.speed = speed;
        this.gear = gear;
    }

    public void increaseGear(){
        this.setGear( this.gear+1 );
        System.out.println("gearIncreased " + this.gear);
    }

    public void decreaseGear(){
        this.setGear( this.gear-1 );
        System.out.println("gearDecreased " + this.gear);
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    private int increaseSpeed(){
        this.setSpeed((this.speed+1));
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void steeringLeft(){
        System.out.println("Turning Left");
    }

    public void steeringRight(){
        System.out.println("Turning Right");
    }

    public String getMake() {
        return make;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWindows() {
        return windows;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }
}
