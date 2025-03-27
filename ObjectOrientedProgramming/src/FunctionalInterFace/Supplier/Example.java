package FunctionalInterFace.Supplier;

import java.util.function.Supplier;

class SupplierStudent {
    private String name;
    private int age;

    public SupplierStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
public class Example {

    public static void main(String[] args) {

        // Supplier is a functional interface which takes no argument and returns a result.
        // It is used to supply a value
        // It is used to generate or supply values without taking any input.

        // Supplier is a functional interface which takes no argument and returns a result.
        // It is used to supply a value
        // It is used to generate or supply values without taking any input.

        Supplier<SupplierStudent> supplier = () -> new SupplierStudent("Rahul", 25);
        System.out.println(supplier.get());

    }
}
