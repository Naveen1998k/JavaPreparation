package FunctionalInterFace.Consumer;

import java.util.ArrayList;
import java.util.List;

public class ConsumerWithStream {
    public static void main(String[] args) {
        // Consumer is a functional interface, which takes an argument and returns nothing.
        // It has a method called accept() which takes an argument and returns nothing.
        // It is used to perform some operations on the argument passed and return nothing.
        // Consumer is used in the forEach() method of the Stream interface.
        // It is used to perform some operations on each element of the stream.
        // Consumer is a functional interface, which takes an argument and returns nothing.
        // It has a method called accept() which takes an argument and returns nothing.
        // It is used to perform some operations on the argument passed and return nothing.
        // Consumer is used in the forEach() method of the Stream interface.
        // It is used to perform some operations on each element of the stream.

        //example using stream and consumer
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Ruby");
        list.add("PHP");
        list.add("C#");
        list.add("Go");
        list.add("Swift");
        list.add("Kotlin");

        list.stream().forEach(System.out::println);
    }
}
