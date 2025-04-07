package Exception;

public class ArithmeticExceptionEx {

    public static void main(String[] args) {
        System.out.println("Program started");
        int val=100;
        int div=0;
        try{
            int result=val/div;
            System.out.println("Result is: "+result);
        }catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            System.out.println("Exception message: " + e.getMessage());
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
