package com.constructer.demo;

class Studen2 {
    private int id;
    private String name;

    public Studen2() {
        this(101);
    }

    public Studen2(int id) {
        this("pankaj");
    }

    public Studen2(String name) {

        this(101, "alam");
    }

    public Studen2(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("id=" + id + " name=" + name);
    }
}

public class ConChain {
    public static void main(String[] args) {

        Studen2 studen2 = new Studen2();
    }
}