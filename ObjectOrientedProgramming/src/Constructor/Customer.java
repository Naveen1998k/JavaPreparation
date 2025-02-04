package Constructor;

public class Customer
{
    int  id;
    String name;
    String address;

    public void insertRecord(int i, String n, String a)
    {
        id = i;
        name = n;
        address = a;
     }

    public void displayInformation(){
        System.out.println("Customer ID: "+id);
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Address: "+address);
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();

        c1.insertRecord(101, "John", "New York");
        c2.insertRecord(102, "Smith", "California");

        c1.displayInformation();
        System.out.println("=====================================");
        c2.displayInformation();

    }
}
