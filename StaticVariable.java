package com.demo.ex.javaapplication;

class ExampleStatic {
    public static int staticVar = 0;
    int instanceVar;

    public static int varNewStatic = 1000;

    static {
        System.out.println("from static block");
    }

    public ExampleStatic(int a) {
        this.instanceVar = a;
        // staticVar++;
    }

    public int getInstanceVar() {
        return this.instanceVar;
    }

    public static String getStaticVar() {
        return "static method";
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        ExampleStatic ex = new ExampleStatic(10);
        System.out.println(ex.instanceVar + " " + ExampleStatic.staticVar);
        ExampleStatic ex1 = new ExampleStatic(20);

        System.out.println(ex1.instanceVar + " " + ExampleStatic.staticVar);
        System.out.println(ex.getInstanceVar());

        System.out.println(ExampleStatic.varNewStatic);
        String str = ExampleStatic.getStaticVar();
        System.out.println(str);
    }
}
