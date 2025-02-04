package Syntax;

public class SyntaxOfClass
{
    public static void main(String[] args)
    {
        // Creating object of class
        SyntaxOfClass obj = new SyntaxOfClass();
        obj.printHello();
    }

    /**
     * Public id an access modifier which represents visibility
     * Public means it is visible to all other classes
     * Static is used for memory management
     * Void is used to define the return type of the method
     * Main represents the starting point of the program
     * String[] args is used for command line arguments
     * System.out.println() is used to print statement
     * The main method is the entry point of the program Must be declared as public, static, and void
     * if main method is not declared as public, then program will compile, but it will not be executed by JVM
        Note
     java Compiler point of view there is no rule to declare our method as public
     Static
     ----------
     Static  is a non-access modifier in Java which is applicable for the following:
        1. Blocks
        2. Variables
        3. Methods
        4. Nested classes
        Static blocks

        Static blocks are used to initialize the static variables.
        If we want to perform any task at the time of class loading, we can define the task inside the static block.
        There are two types of static blocks:
        1. Static block
        2. Static block without the main method
        Static block.
        Static block is used to initialize the static data member.
        It is executed before the main method at the time of classloading.
        Static block without the main method
        Static block is used to initialize the static data member.
        It is executed before the main method at the time of classloading.



     */

    // Method to print Hello
    public void printHello()
    {
        System.out.println("Hello");
     }
}
