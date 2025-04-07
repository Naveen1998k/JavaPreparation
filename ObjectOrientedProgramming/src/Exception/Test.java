package Exception;

public class Test {

    public static void main(String[] args) {

        try{
            System.out.println("Inside try block");
            int a = 5/0; // This will cause an ArithmeticException
            System.out.println("This line will not be executed");
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        //Syntax Of try-catch-finally
        // try {
        //     // code that may throw an exception
        // } catch (ExceptionType e) {
        //     // code to handle the exception

        // } finally {
        //     // code that will always execute, regardless of whether an exception was thrown or not
        // }

    }
}
