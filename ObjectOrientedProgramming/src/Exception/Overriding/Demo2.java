package Exception.Overriding;

import java.io.IOException;

class Parent2 {
    void show()  throws IOException {
        System.out.println("Parent class method");
    }
}
class Child2 extends Parent2 {
    void show() throws IOException { // overriding method
        System.out.println("Child class method");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Parent2 p = new Child2(); // Parent reference and child object
      try {
          p.show();// It will call the child class method
      }catch (IOException e) {
          e.printStackTrace();
      }
        // Child2 c = new Parent2(); // Compile time error: incompatible types
        // c.show(); // It will call the parent class method
    }
}
