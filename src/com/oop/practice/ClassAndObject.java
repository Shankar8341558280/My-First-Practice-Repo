package com.oop.practice;

public class ClassAndObject {
    private String name;
    private int age;
    private char grade;

    public ClassAndObject()
    {
        System.out.println("No Values to set");
    }

    public ClassAndObject(String name, int age, char grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails()
    {
        System.out.println("Student Name : " +name+ "\nAge : " +age+ "\nGrade : " +grade);
    }
}
