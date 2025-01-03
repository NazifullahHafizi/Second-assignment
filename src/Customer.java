import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Subclass: Customer
class Customer extends User {
    private List<Order> orders;
    private String shippingAddress;

    public Customer(int userId, String name, String email, String shippingAddress) {
        super(userId, name, email);
        this.shippingAddress = shippingAddress;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            product.reduceStock(quantity);
            Order order = new Order(UUID.randomUUID().toString(), this, product, quantity);
            orders.add(order);
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Insufficient stock for product: " + product.getName());
        }
    }

    public void cancelOrder(Order order) {
        if (orders.contains(order)) {
            order.cancelOrder();
            orders.remove(order);
            System.out.println("Order cancelled successfully.");
        } else {
            System.out.println("Order not found.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer ID: " + this.getEmail());
        System.out.println("Shipping Address: " + shippingAddress);
    }
}
