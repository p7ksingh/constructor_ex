package com.constructer.demo;

class Student1 {

    private String name;

    private int id;

    // no-argument constructor
    public Student1() {
        System.out.println("no-argument constructor called !");
    }

    // overloaded constructor with one argument(name)
    public Student1(String name) {
        this.name = name;
        System.out.println("constructor with one argument(name) called !");
    }

    // overloaded constructor with one argument(id) 'argument type is different'
    public Student1(int id) {
        this.id = id;
        System.out.println("constructor with one argument(id) called !");
    }

    // another overloaded constructor with two argument (String , int)
    public Student1(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("constructor with two arguments(String , int) called !");
    }

    // another overloaded constructor with two argument (int , String) 'Seq of
    // arguments is different'
    public Student1(int id, String name) {
        this.name = name;
        this.id = id;
        System.out.println("constructor with two arguments(int , String) called !");
    }
}

public class Main1 {

    public static void main(String args[]) {

        // object creation and no-argument constructor called
        Student1 s1 = new Student1();

        // object creation and constructor with one param(String) called
        Student1 s2 = new Student1("Vikram");

        // object creation and constructor with one param(int) called
        Student1 s3 = new Student1(10);

        // object creation and constructor with two params (String ,int) called
        Student1 s4 = new Student1("Vikas", 29);

        // object creation and constructor with two params (int , String) called
        Student1 s5 = new Student1(29, "Vivek");

    }
}