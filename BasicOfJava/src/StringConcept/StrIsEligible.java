package StringConcept;

public class StrIsEligible {
    public static void main(String[] args) throws InterruptedException {
        String str1 = "Hello";

        System.out.println("str1: " + str1.hashCode());

        str1=null;
        //System.out.println("str1: " + str1.hashCode());
        System.gc();

        Thread.sleep(1000);
        String str2 = "Hello";
        System.out.println("str2: " + str2.hashCode());
    }
}
