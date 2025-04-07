package Exception;

public class ReturnStatement {


    public int methodWithReturn() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // This will throw an ArrayIndexOutOfBoundsException
            return 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
             return 1;// This will exit the method and not execute the finally block
        } finally {
            System.out.println("This is the finally block.");
        }
         // This line will never be reached

    }
    public static void main(String[] args) {
        ReturnStatement obj = new ReturnStatement();
        int result = obj.methodWithReturn();
        System.out.println("Result: " + result); // This will print the value returned from the method
    }


}
