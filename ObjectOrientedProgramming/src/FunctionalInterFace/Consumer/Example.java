package FunctionalInterFace.Consumer;

import java.util.function.Consumer;

/**
 * @FunctionalInterface
 * public interface Consumer<T> {
 *     void accept(T t);
 * }
 */
public class Example {

    public static void main(String[] args) {
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("Hello World");

        Consumer<Integer> consumer1 = ( i) -> System.out.println(i);
        consumer1.accept(10);
    }
}
