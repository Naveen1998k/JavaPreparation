package FunctionalInterFace.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExampleWithStream {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,20,24,30,45,36,70);
        Predicate<Integer> isEven= num->num%2==0;

        List<Integer> evenNumbers =numbers.stream().filter(isEven).collect(Collectors.toList());

        System.out.println(evenNumbers);

        List<Integer> evenNumbers1 =numbers.stream().filter(isEven).toList();
        System.out.println(evenNumbers1);


    }
}
