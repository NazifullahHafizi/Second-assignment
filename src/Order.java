// Order Class
class Order {
    private String orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private double totalPrice;
    private String status;

    public Order(String orderId, Customer customer, Product product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
        this.status = "Placed";
    }

    public void cancelOrder() {
        if (status.equals("Placed")) {
            status = "Cancelled";
            product.increaseStock(quantity);
        }
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getEmail());
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Status: " + status);
    }
}
