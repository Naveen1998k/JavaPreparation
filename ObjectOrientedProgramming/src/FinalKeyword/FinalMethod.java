package FinalKeyword;
class Parent {
    final void show() {
        System.out.println("Parent's show()");
    }
}
class Child extends Parent {
     //This will give an error as we cannot override final method
//     void show() {
//         System.out.println("Child's show()");
//     }
}
public class FinalMethod {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
