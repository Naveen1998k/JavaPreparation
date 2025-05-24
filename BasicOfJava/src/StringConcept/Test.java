package StringConcept;

public class Test {



    public static void main(String[] args) {
        String s="Naveen";
        System.out.println(s);

        String s1=new String("Naveen");
        System.out.println(s1);

        char s3[]={'N','a','v','e','e','n'};
       System.out.println(s3);

        String s4=new String(s3);
        System.out.println(s4);

        String s5="Naveen";
        String s6="Naveen";
        System.out.println(s5==s6); // true
        System.out.println(s5.equals(s6)); // true

        String s7=new String("Naveen");
        String s8=new String("Naveen");
        System.out.println(s7==s8); // false
        System.out.println(s7.equals(s8)); // true
    }
}
