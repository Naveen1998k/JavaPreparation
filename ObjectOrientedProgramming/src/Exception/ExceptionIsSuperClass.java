package Exception;

public class ExceptionIsSuperClass {

    public static void main(String[] args) {

      Exception ex=  new ArithmeticException("Division by zero");
        System.out.println(ex.getMessage());

      Exception arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        System.out.println(arrayIndexOutOfBoundsException.getMessage());
        Exception nullPointerException = new NullPointerException();
        System.out.println(nullPointerException.getMessage());
    }
}
