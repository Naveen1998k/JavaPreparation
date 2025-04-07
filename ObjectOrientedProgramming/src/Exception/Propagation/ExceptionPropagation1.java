package Exception.Propagation;

public class ExceptionPropagation1 {

    public static void method1() {
        System.out.println("Inside method1");
       try {
           method2();
       }catch (Exception e) {
           System.out.println("Caught in method1: " + e.getMessage());
       }
        System.out.println("After method2");
    }

    public static void method2() {
        System.out.println("Inside method2");
        System.out.println(10 / 0); // This will cause an ArithmeticException
        System.out.println("After division");

    }
    public static void main(String[] args) {

        System.out.println("Main method started");
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
         // This will not be executed if an exception occurs in method1
        System.out.println("Main method ended");



    }
}
