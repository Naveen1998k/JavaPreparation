package Interface;

import javax.annotation.processing.SupportedSourceVersion;

interface l
{
    default void m1(){
        System.out.println("Default Method inside l Interface");
    }
}
interface ll{

    default void m1(){
      System.out.println("Default Method inside ll Interface");
    }
}

class Imp implements l,ll{

    @Override
    public void m1() {
        l.super.m1();
        ll.super.m1();
        System.out.print("M1Method inside imp Class");
    }
}
public class MultipleInhertanceUsingDefault {


    public static void main(String[] args) {

        Imp i=new Imp();
        i.m1();
    }
}
