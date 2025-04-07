package Exception;

public class ReturnExample {

    public int methodWithReturn() {
        try {
           System.out.println("Inside try block");
            System.out.println(10/0); // This will throw an ArrayIndexOutOfBoundsException
            return 10/0;
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            return 10/0; // This will exit the method and not execute the finally block
        } finally {
            System.out.println("This is the finally block.");
        }
        // This line will never be reached
    }

    public static void main(String[] args) {
        ReturnExample obj = new ReturnExample();
        int result = obj.methodWithReturn();
        System.out.println("After call method");
        System.out.println("Result: " + result); // This will print the value returned from the method
    }
}
