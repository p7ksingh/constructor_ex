class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }

    void callParentMethod() {
        super.display();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.callParentMethod(); // Output: Parent class method
    }
}