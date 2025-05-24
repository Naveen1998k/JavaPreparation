package StringConcept;

public class StringRef {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("str1: " + str1.hashCode());
        System.out.println("str2: " + str2.hashCode());
        // Comparing references
        if (str1 == str2) {
            System.out.println("str1 and str2 refer to the same object.");
        } else {
            System.out.println("str1 and str2 refer to different objects.");
        }

        // Comparing values
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same value.");
        } else {
            System.out.println("str1 and str2 have different values.");
        }
    }
}
