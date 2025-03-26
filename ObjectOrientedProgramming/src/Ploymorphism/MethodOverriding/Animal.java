package Ploymorphism.MethodOverriding;

public class Animal
{
    public void sound()
    {
        System.out.println("Animal is making a sound");
    }
}
class  Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}

