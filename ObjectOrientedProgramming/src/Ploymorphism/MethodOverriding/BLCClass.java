package Ploymorphism.MethodOverriding;

public class BLCClass {
    public static void main(String[] args) {
        Animal obj = new Dog(); //upcasting
        obj.sound();

        Dog obj1= (Dog) new Animal(); //downcasting
        obj1.sound(); //Here Complie time no error but runtime error will occur because we are trying to convert parent class object to child class object
        //java.lang.ClassCastException will occur

    }
}
