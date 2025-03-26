package TypeCasting;

public class Demo
{
    public static void main(String[] args)
    {
        // Implicit Type Casting
        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("Implicit Type Casting");
        System.out.println("Int Value: " + i);
        System.out.println("Long Value: " + l);
        System.out.println("Float Value: " + f);
        System.out.println("Double Value: " + d);

        // Explicit Type Casting
        double d1 = 100.04;
        long l1 = (long)d1;
        int i1 = (int)l1;
        System.out.println("Explicit Type Casting");
        System.out.println("Double Value: " + d1);
        System.out.println("Long Value: " + l1);
        System.out.println("Int Value: " + i1);
    }
}
