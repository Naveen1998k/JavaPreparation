package Encapsulation;

public class MainCls {

    public static void main(String[] args) {
        Student student=new Student();
        student.setName("John");
        System.out.println("Student name is: "+student.getName());

        // The following line would cause a compilation error because name is private
        // System.out.println(student.name);
        // student.name="John"; // Error: name has private access in Student

        Account account=new Account();
        account.setAccountNumber(123456789);
        account.setAccountHolderName("K Naveen");
        account.setEmail("naveen@gmail.com");
        account.setBalance(10000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Balance: " + account.getBalance());

    }
}
