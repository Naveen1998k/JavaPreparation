package Interface;

public class BankApplication {

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("===============================================");
        customer.deposit(1000);
        System.out.println("===============================================");
        customer.withdraw(500);
        System.out.println("===============================================");
        customer.withdraw(1000);
        System.out.println("===============================================");
        customer.withdraw(100);
        System.out.println("===============================================");
        customer.deposit(-100);
    }
}
