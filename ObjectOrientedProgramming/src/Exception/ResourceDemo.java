package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ResourceDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try(sc){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            System.out.println("You entered: "+num);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid number.");
        }catch (Exception e){
            System.out.println("An unexpected error occurred: "+e.getMessage());
    }
        // No need to explicitly close the scanner, it will be closed automatically
        // when the try-with-resources block ends.
    }
}
