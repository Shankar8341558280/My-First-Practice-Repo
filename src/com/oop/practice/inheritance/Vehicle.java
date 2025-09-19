package com.oop.practice.inheritance;

public class Vehicle {
    private String brand;
    private int speed;
    private Boolean engine = false;

    public Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    public Vehicle(String brand, int speed, Boolean engine) {
        this.brand = brand;
        this.speed = speed;
        this.engine = engine;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(!brand.isEmpty())
            this.brand = brand;
        else
            System.out.println("Brand should not be empty");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
        else
            System.out.println("Speed must be Greater than 0");
    }

    public boolean start()
    {
        if(!engine)
        {
            System.out.println("Engine started");
        }
        else
            System.out.println("Engine already running!!");
        return true;
    }

    public boolean stop()
    {
        if(engine)
        {
            System.out.println("Engine Turned Off...");
        }
        else System.out.println("Engine already in Off State");
        return false;
    }
}
