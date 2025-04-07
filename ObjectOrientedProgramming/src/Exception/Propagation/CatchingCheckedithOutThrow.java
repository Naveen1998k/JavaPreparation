package Exception.Propagation;

public class CatchingCheckedithOutThrow {
    public static void main(String[] args) {
        try {
            // This will throw an exception
            throw new InterruptedException("This is a checked exception");
        } catch (InterruptedException e) {
            // Catching the checked exception
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        System.out.println("Program continues after catching the exception.");
    }
}
