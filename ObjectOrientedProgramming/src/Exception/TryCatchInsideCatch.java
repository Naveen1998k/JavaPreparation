package Exception;

public class TryCatchInsideCatch {

    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            try {
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e1) {
                System.out.println("Caught ArithmeticException: " + e1.getMessage());
            }
        }
    }
}
