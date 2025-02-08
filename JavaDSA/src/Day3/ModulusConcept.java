package Day3;

public class ModulusConcept
{

    public static void evenOrOdd(int[] arr)
    {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }


    public static void findModulus(int[] arr)
    {
        for (int i : arr) {

            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " is divisible by 3 and 5");
            }
            else if(i % 3 == 0)
            {
                System.out.println(i + " is divisible by 3");
            }
            else if(i % 5 == 0)
            {
                System.out.println(i + " is divisible by 5");
            }
            else
            {
                System.out.println(i + " is not divisible by 3 or 5");
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {11, 2, 3, 4, 5, 6, 7, 8, 24, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        evenOrOdd(arr);

        findModulus(arr);

    }
}
