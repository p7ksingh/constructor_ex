class Parent1 {
    int value = 10;
}

class Child extends Parent1 {
    int value = 20;

    void displayValue() {
        System.out.println("Child value is : " + value);
        System.out.println("Parent value is : " + super.value);
    }
}

public class SuperVar {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayValue();
    }
}
