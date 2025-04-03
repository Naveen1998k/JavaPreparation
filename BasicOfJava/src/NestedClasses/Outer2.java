package NestedClasses;

public class Outer2
{
    private int data = 30;

    class Inner2
    {
       public static void show()
        {
            System.out.println("Inner class method");
        }
    }

    class Inner3
    {
        public void show()
        {
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
       Outer2.Inner2.show();
    }
}
