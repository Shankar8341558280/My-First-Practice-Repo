package com.oop.practice.polymorphism;

public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * (radius * radius);

    }

    @Override
    public void display() {

        System.out.println("This is a Circle");

    }
}
