package com.oop.practice.inheritance;

public class Bike extends Vehicle{
    public Bike() {
        System.out.println("Bike Constructor");
    }

    public Boolean kickStart(Boolean engine)
    {
        if(!engine)
        {
            System.out.println("Kick Start your Bike");
            return true;
        }
        System.out.println("Engine is already running!!");
        return false;
    }
}
