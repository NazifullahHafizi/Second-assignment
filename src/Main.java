// Main Class
public class Main{
    public static void main(String[] args) {
        // Create Admins
        Admin admin1 = new Admin(1, "Nazifullah", "nazifullah.hafizi.20@gmail.com");

        // Create Products
        Product product1 = new Product("N1", "Nazif(PC)", 1000.0, 10);
        Product product2 = new Product("N2", "Phone(14ProMax)", 800.0, 20);
        admin1.addProduct(product1);
        admin1.addProduct(product2);

        // Create Customers
        Customer customer1 = new Customer(1, "Nimatullah", "afghan7895@gmail.com", "123 Main St");
        // Place Orders
        customer1.placeOrder(product1, 2);
        customer1.placeOrder(product2, 1);

        // Cancel an Order
        Order order = new Order("O1", customer1, product1, 2);
        customer1.cancelOrder(order);

        // Display Details
        admin1.displayDetails();
        customer1.displayDetails();
        product1.displayDetails();
    }
}
