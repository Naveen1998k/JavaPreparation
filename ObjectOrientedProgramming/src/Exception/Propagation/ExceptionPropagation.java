package Exception.Propagation;

public class ExceptionPropagation {
    public static void main(String[] args) {
        System.out.println("Main method started");
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        System.out.println("Main method ended");
    }

    static void method1() throws Exception {
        System.out.println("Inside method1");
        method2();
    }

    static void method2() throws Exception {
        System.out.println("Inside method2");
        throw new Exception("Exception thrown from method2");
    }
}
