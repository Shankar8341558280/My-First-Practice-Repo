package com.oop.practice.polymorphism;

public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void display() {
        System.out.println("This is a Triangle");
    }
}
