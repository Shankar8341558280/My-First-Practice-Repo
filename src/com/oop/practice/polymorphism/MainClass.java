package com.oop.practice.polymorphism;

public class MainClass {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);        // radius = 5
        shapes[1] = new Rectangle(8, 5);  // length = 8, width = 5
        shapes[2] = new Triangle(10, 5);

        for (Shape shape : shapes) {
            shape.display();
            System.out.println("Area: " + shape.getArea());
            System.out.println();
        }
    }
}
