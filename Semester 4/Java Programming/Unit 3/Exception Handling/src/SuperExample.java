class Parent {
    int num = 10;

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int num = 20;

    void display() {
        System.out.println("Child class method");
    }

    void callSuper() {
        // Accessing the num variable from the superclass
        System.out.println("Value of num in superclass: " + super.num);

        // Calling the display method of the superclass
        super.display();
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.callSuper();
    }
}
