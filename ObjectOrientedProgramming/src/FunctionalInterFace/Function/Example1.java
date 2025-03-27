package FunctionalInterFace.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> squareFunction = num -> num * num;

        List<Integer> squares = numbers.stream()
                .map(squareFunction)
                .collect(Collectors.toList());

        System.out.println(squares); // Output: [1, 4, 9, 16, 25]
    }
}
