package SuperKeyWord;
class Var{
    int num = 110;
}

public class SuperClassVar extends Var{
    int num = 100;

    void display() {
        System.out.println("This is the display method of SuperClassVar");
        System.out.println("Value of num in SuperClassVar: " +num);
       System.out.println("Value of num in Var: " + super.num);
    }


    public static void main(String[] args) {
        SuperClassVar obj = new SuperClassVar();
        obj.display();
    }
}
