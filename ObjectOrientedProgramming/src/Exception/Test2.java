package Exception;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Main method started");

        try{
            String name = null;
            System.out.println(name.length()); // This will cause a NullPointerException

        }catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("Exception caught");
            System.out.println("========================================================");
         e.printStackTrace();
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
