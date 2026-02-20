import java.util.UUID;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;
    private String productId;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productId = UUID.randomUUID().toString();
    }


    public abstract double getDiscountedPrice();
    public abstract boolean isExpired();
    public abstract String getStorageConditions();
    public abstract void displayInfo();


    public double getTotalValue() {
        return getDiscountedPrice() * quantity;
    }


    public String getName()  { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getProductId() { return productId; }
}