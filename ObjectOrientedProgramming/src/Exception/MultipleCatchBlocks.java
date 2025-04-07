package Exception;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try{
            System.out.println("Try block executed");
            int[] arr = {1, 2, 3};
            System.out.println("Array element: " + arr[2]); // This will cause ArrayIndexOutOfBoundsException

            int result = 10 / 2; // This will cause ArithmeticException
            System.out.println("Result: " + result);

            String name=null;
            System.out.println("Name length: " + name.length()); // This will cause NullPointerException
            System.out.println("Try block executed after sum");



        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
