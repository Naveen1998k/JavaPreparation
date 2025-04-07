package Exception;

public class MultiCatchBlock {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[2]); // ArrayIndexOutOfBoundsException

            int result = 10 / 2; // ArithmeticException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Array index out of bounds or null pointer exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
