package Exception;

public class ArrayIndexOutOfBoundsExceptionEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Attempting to access an index that is out of bounds
            System.out.println("Number: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("This block always executes.");
        }
    }
}
