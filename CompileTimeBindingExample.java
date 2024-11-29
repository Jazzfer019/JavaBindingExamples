
package compiletimebindingexample;
// This program demonstrates Compile-Time Binding (Method Overloading)
// Compile-Time Binding occurs when the method to call is decided at compile-time.

public class CompileTimeBindingExample {
 // Overloaded method: same name but different parameter lists
  public void display(int number) {
        System.out.println("Display method with Integer parameter: " + number);
    }

    public void display(String text) {
        System.out.println("Display method with String parameter: " + text);
    }

    public void display(int number, String text) {
        System.out.println("Display method with Integer and String: " + number + " and " + text);
    }

    public static void main(String[] args) {
        // Create an object of CompileTimeBindingExample
        CompileTimeBindingExample example = new CompileTimeBindingExample();

        // Compile-Time Binding happens here
        example.display("011902");          // Calls display(int number)
        example.display("HI afer");    // Calls display(String text)
        example.display("19,afer");// Calls display(int number, String text)
    }
}