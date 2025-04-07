package Exception;

public class NumberFormatExceptionEx {


    public static void main(String[] args) {
        String str = "123a";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("This block always executes.");
        }
    }
}
