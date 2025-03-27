package AnonymousClasses;
class Base{
    public void display(){
        System.out.println("Display Method Inside Base Class ");
    }
}
public class AnonymousClassEx {

    public static void main(String[] args) {

        Base derived=new Base(){

            @Override
            public void display() {

                super.display();
                System.out.println("Display method inside Derived ref");
            }
        };
        derived.display();
    }
}
