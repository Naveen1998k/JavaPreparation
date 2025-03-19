package Inheritance;


class Employee {
    float salary = 40000;
}
class Programer extends Employee {
    int bonus = 10000;

}
public class Main {
    public static void main(String[] args) {
        Programer p = new Programer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}
