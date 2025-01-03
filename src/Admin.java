import java.util.ArrayList;
import java.util.List;

class Admin extends User {
    private List<Product> products;

    public Admin(int userId, String name, String email) {
        super(userId, name, email);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product existingProduct : products) {
            if (existingProduct.getProductId().equals(product.getProductId())) {
                System.out.println("Product with ID " + product.getProductId() + " already exists.");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void removeProduct(String productId) {
        boolean removed = products.removeIf(product -> product.getProductId().equals(productId));
        if (removed) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void updateStock(String productId, int newStock) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setStock(newStock);
                System.out.println("Stock updated successfully for Product ID: " + productId);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Name: " + super.getName() + ", Email: " + super.getEmail());
        System.out.println("Managed Products:");
        for (Product product : products) {
            product.displayDetails();
        }
    }
}
