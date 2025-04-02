package JVM.RuntimeDataArea;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class  Demo{
    int sumOfValues = 10;
    static int rollNo = 20;
    Scanner sc = new Scanner(System.in);

    public void m(){}
    public static void show(){}
    public void move(){}
    public void display(){}


}
public class CompleteInfo {
    public static void main(String[] args) throws Exception {

      Class cls=  Class.forName("JVM.RuntimeDataArea.Demo");

      System.out.println("Name Of The Class : "+cls.getName());
      System.out.println("Simple Name Of The Class : "+cls.getSimpleName());

      System.out.println("Package Name : "+cls.getPackageName());
      System.out.println("Package : "+cls.getPackage());
        System.out.println("Super Class : "+cls.getSuperclass());

     Field[] var = cls.getDeclaredFields();
    Method[] methods =cls.getDeclaredMethods();


    for(Field f : var){
        System.out.println(f.getName());
    }
    for(Method m : methods){
        System.out.println(m.getName());
    }
    }


}
