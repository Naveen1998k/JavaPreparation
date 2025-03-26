package Association;

public class Manger {
    public static void main(String[] args) {
        Address address = new Address("Pune", "Maharashtra", "India");
        Employee employee = new Employee("John", 101, address);
        System.out.println(employee);
    }
}
