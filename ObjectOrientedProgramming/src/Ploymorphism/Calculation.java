package Ploymorphism;

public class Calculation
{

    public int add(int a, int b)
    {

        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public double add(double a, double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.add(10, 20));
        System.out.println(calculation.add(10, 20, 30));
        System.out.println(calculation.add(10.5, 20.5));

    }
}
