package com.demo.ex.javaapplication;

class ISuperClassEx {
    public ISuperClassEx() {
        System.out.println("ISuperClassEx");
    }

    public void test() {
        System.out.println("test seniour");
    }

}

public class SuperClassEx extends ISuperClassEx {

    public SuperClassEx() {
        super();
        System.out.println("SuperClassEx");
    }

    public void test() {
        super.test();
        System.out.println("test juniour");
    }

    public static final void main(String[] args) {
        ISuperClassEx ex = new SuperClassEx();
        ex.test();
    }
}
