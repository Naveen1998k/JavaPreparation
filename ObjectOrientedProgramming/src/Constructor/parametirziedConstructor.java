package Constructor;

public class parametirziedConstructor
{

    int number;
    String name;

    public parametirziedConstructor(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static void main(String[] args) {

        parametirziedConstructor parametirziedCOnstructor = new parametirziedConstructor("Naveen", 100);
        new parametirziedConstructor("Vinay",400);
        System.out.println(parametirziedCOnstructor);
    }
}
