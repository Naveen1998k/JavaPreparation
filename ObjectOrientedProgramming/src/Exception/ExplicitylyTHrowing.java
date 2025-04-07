package Exception;

public class ExplicitylyTHrowing {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            throw new ArithmeticException("This is an explicitly thrown exception");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
