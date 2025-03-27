package FunctionalInterFace.Predicate;

import java.util.function.Predicate;

/**
 * The Predicate interface provides default methods for combining multiple predicates:
 *
 * and(): Combines two predicates (both must be true).
 *
 * or(): At least one must be true.
 *
 * negate(): Reverses the result.
 */
public class PredicateChaining {

    public static void main(String[] args) {
        Predicate<String> startsWithJ=str ->str.startsWith("J");
        Predicate<String> endsStartsWithA=str ->str.endsWith("a");

        Predicate<String > combined= startsWithJ.and(endsStartsWithA);


        System.out.println(combined.test("Java"));
    }




}
