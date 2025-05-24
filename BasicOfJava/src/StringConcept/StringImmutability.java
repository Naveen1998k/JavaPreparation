package StringConcept;

public class StringImmutability {

    public static void main(String[] args) {
        String s = "Naveen";
        System.out.println(s);

        s=s.concat("Kokkiligadda");
        System.out.println(s); // String is immutable, original string is not changed
    }
}
