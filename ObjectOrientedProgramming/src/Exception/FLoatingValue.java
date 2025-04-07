package Exception;

public class FLoatingValue {

    public static void main(String[] args) {
        try{
            System.out.println("Try block executed");
            double sum=10/0.0;
            System.out.println("Sum: " + sum);
            System.out.println("Try block executed after sum");

        }catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
