package com.constructer.demo;


class Student {

    private String name;

    private int id;

    //parameterized constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("constructor with two arguments(String , int) called !");
        System.out.println("name : "+this.name+" id : "+this.id);
    }

    //copy constructor
    public Student(Student student){
        this.name = student.name;
        this.id = student.id;
        System.out.println("copy constructor called !");
        System.out.println("name : "+this.name+" id : "+this.id);
    }
}

public class Main {

    public static void main(String args[]) {

        //object creation and constructor with two params (String ,int) called
        Student s1 = new Student("Vikas",29);

        //object creation and copy constructor called
        Student s2 = new Student(s1);

    }
}