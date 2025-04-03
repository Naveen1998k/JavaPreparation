package NestedClasses;

public class Local {

   private final int value=10;
   static int staticValue=20;

    // Local inner class
    // A local inner class is defined within a method or a block
    // It can access the local variables of the method or block
    // It can also access the instance variables of the outer class

    // It can be used to implement a specific functionality that is only needed within the method or block

    public void display(){
        int localValue=30;

        class LocalInner{

            public void show(){

                // localValue=40; // Cannot assign a value to final variable localValue
                System.out.println("This is a local inner class ="+localValue + " and instance value ="+value);
                System.out.println("This is a local inner class ="+value + " and static value ="+staticValue);
            }

        }
        LocalInner localInner = new LocalInner();
        localInner.show();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.display();
    }
}
