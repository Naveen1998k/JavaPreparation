package Exception;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Main method started");
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println("Enter a Number ");
            int b = sc.nextInt();
            int c = a/b;



            System.out.println("Inside try block");

        }catch (Exception e)
        {
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
