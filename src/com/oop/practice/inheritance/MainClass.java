package com.oop.practice.inheritance;

public class MainClass {

    public static void main(String[] args) {
        Vehicle vhCar = new Car();
        vhCar.setSpeed(100);
        System.out.println();
        vhCar.setSpeed(-129);
        System.out.println();
        vhCar.setBrand("Thar");
        System.out.println();
        vhCar.setBrand("");
        System.out.println();
        vhCar.stop();
//        vhCar.honk(); we can't call the methods in child class with the object which has reference type as parent class
        if(vhCar instanceof Car)
        {
            ((Car) vhCar).honk(vhCar.getEngine());
        }
        System.out.println();
        vhCar.start();
        System.out.println();
        vhCar.start();

    }

}
