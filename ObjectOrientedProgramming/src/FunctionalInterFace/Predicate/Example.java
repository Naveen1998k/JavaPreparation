package FunctionalInterFace.Predicate;

import java.util.function.Predicate;

//@FunctionalInterface
//public interface Predicate<T> {
//    boolean test(T t);
//}


public class Example {
    public static void main(String[] args) {

        // Check Given Number is Even or Odd

        Predicate<Integer> isEven= num-> num%2==0;
        System.out.println("Number is Even  "+isEven.test(10));
        System.out.println("Number is Even  "+isEven.test(11));

        Predicate<Integer> isEligible= age-> age>=18;

        System.out.println("is Eligible For Vote  "+isEligible.test(18));
        System.out.println("is Eligible For Vote  "+isEligible.test(17));

        Predicate<String> res= str-> str.startsWith("R");
        System.out.println("Ravi Starts With R  "+res.test("Ravi"));
        System.out.println("Kishore Starts With R  "+res.test("Kishore"));










    }
}
