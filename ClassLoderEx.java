package com.demo.ex.javaapplication;

class JavaApplication {
    public void add(int a, int b) {
        System.out.println(a + b);
        // System.out.println(JavaApplication.class.getClassLoader());
        // System.out.println(java.util.ArrayList.class.getClassLoader());
    }
}

class newJavaApplication extends JavaApplication {

    public void add(int a, int b) {
        System.out.println(newJavaApplication.class.getClassLoader());
    }
}

public class ClassLoderEx {
    public static void main(String[] args) {

        // System.out.println(ClassLoderEx.class.getClassLoader());
        JavaApplication jex = new newJavaApplication();
        jex.add(10, 10);
        // memory load
        Runtime r = Runtime.getRuntime();
        System.out.println(r.maxMemory());
        System.out.println(r.freeMemory());
    }
}
