package Exception;

public class UserDefinedException
{

    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("This is a checked exception");
        } catch (CustomCheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            throw new CustomUnCheckedException("This is an unchecked exception");
        } catch (CustomUnCheckedException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
