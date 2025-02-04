package Constructor;

public class Test {

    int age;
    String name;

    public Test(int number) {
        System.out.println("Constructor with one argument  "+number);
    }

    public static void main(String[] args) {
        // Creating object of class Constructor


      //  new Test(); Here, we are calling the constructor of class Constructor without any argument, but we have only one constructor with one argument.
        Test test = new Test(10);
        System.out.println(test.name+" age is "+ test.age);//default value of int is 0 and String is null



        // Calling the method of class Constructor
    }

}
