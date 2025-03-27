package FunctionalInterFace.Function;

import java.util.function.Function;

/**
 * @FunctionalInterface
 * public interface Function<T, R> {
 *     R apply(T t);
 * }
 */
public class Example {
    public static void main(String[] args) {

        Function<Integer,Integer> sum= i-> i+1;

        System.out.println(sum.apply(10));

        Function<String,Integer> length= s-> s.length();

        System.out.println(length.apply("Hello"));

        Function<String,Boolean> isUpperCase= s-> s.equals(s.toUpperCase());

        System.out.println(isUpperCase.apply("HELLO"));
    }
}
