package Constructor;

public class Shop
{
    int totalShops;
    String shopName;
    String shopAddress;

    // Constructor
//    Shop(int totalShops, String shopName, String shopAddress) {
//        this.totalShops = totalShops;
//        this.shopName = shopName;
//        this.shopAddress = shopAddress;
//    }

    // Method to display shop details
   public void displayShopDetails() {
        System.out.println("Total Shops: " + totalShops);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Shop Address: " + shopAddress);
    }

    public static void main(String[] args) {


        //if I have Constructor  then I can create object like this and pass the values to constructor
        // Advantages of Constructor: variables are initialized at the time of object creation
//        Shop shop1 = new Shop(10, "Iran chai", "Vijayawada");
//        Shop shop2 = new Shop(20, "Coffee Shop", "Hyderabad");

        //if I don't have Constructor  then I can create object like this and pass the values to variables
        // Disadvantages of Constructor: variables are initialized after object creation
        Shop shop1 = new Shop();
        shop1.totalShops = 10;
        shop1.shopName = "Iran Chai";
        shop1.shopAddress = "Vijayawada";

        shop1.displayShopDetails();
       // shop2.displayShopDetails();
    }

}
