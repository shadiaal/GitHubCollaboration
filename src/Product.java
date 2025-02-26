import java.util.*;

// Product Class
class Product {
    private UUID productId;
    private String name;
    private double price;
    private int stockLevel;
    private int reorderThreshold;

    // Constructer
    public Product(String name, double price, int stockLevel, int reorderThreshold) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }
    // getting method
    public UUID getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockLevel() { return stockLevel; }
    public int getReorderThreshold() { return reorderThreshold; }

    public void updateStock(int quantity) {
        this.stockLevel -= quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock Level: " + stockLevel);
        System.out.println("Reorder Threshold: " + reorderThreshold);
        System.out.println("----------------------------");
    }
}
