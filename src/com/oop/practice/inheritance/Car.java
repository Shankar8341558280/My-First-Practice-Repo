package com.oop.practice.inheritance;

public class Car extends Vehicle{

    public Car() {
        System.out.println("Car Constructor");
    }


    public void honk(Boolean engine)
    {
        if(engine)
        {
            System.out.println("Car Sounds Horn");
            return;
        }
        System.out.println("Turn on Your Engine First!!");
    }


}
