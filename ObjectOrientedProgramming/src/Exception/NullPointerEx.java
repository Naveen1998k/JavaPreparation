package Exception;

public class NullPointerEx
{
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
