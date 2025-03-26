package Interface;

public class Customer implements Bank{

    private double balance=1000;

    @Override
    public void deposit(int amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
            System.out.println("Current balance: "+balance);
        }else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public void withdraw(int amount) {
        if(amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
            System.out.println("Current balance: "+balance);
        }else {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else {
                System.out.println("Insufficient balance");
            }
        }

    }
}
