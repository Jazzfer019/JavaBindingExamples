
package RunTimeBinding;
// This program demonstrates Run-Time Binding (Method Overriding)
// Run-Time Binding occurs when the method to call is decided at runtime.

class Parent {
    // Method to be overridden
    public void display() {
        System.out.println("Display method from Parent class.");
    }
}

class Child extends Parent {
    // Overriding the display method
    @Override
    public void display() {
        System.out.println("Display method from Child class.");
    }
}

public class RunTimeBindingExample {
    public static void main(String[] args) {
        // Parent class reference pointing to a Parent object
        Parent parent = new Parent();
        parent.display(); // Calls Parent's display method

        // Parent class reference pointing to a Child object
        Parent child = new Child();
        child.display(); // Calls Child's display method (Run-Time Binding)
    }
}
