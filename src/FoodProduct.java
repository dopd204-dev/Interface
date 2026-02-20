import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FoodProduct extends Product {
    private LocalDate expirationDate;
    private boolean requiresRefrigeration;

    public FoodProduct(String name, double price, int quantity,
                       LocalDate expirationDate, boolean requiresRefrigeration) {

        super(name, price, quantity);

        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
    }

    @Override
    public double getDiscountedPrice() {
        if (isExpiringSoon() && !isExpired()) {
            return price * 0.5;
        }
        return price;
    }

    @Override
    public boolean isExpired() {
        return expirationDate.isBefore(LocalDate.now());
    }

    @Override
    public String getStorageConditions() {
        if (requiresRefrigeration) {
            return "Хранить в холодильнике при 0-4°C";
        } else {
            return "Хранить в сухом прохладном месте";
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + getDiscountedPrice());
        System.out.println("Количество: " + quantity);
        System.out.println("Срок годности: " + expirationDate);
        System.out.println("Условия хранения: " + getStorageConditions());

        if (isExpired()) {
            System.out.println("ПРОСРОЧЕНО!");
        }
    }

    private boolean isExpiringSoon() {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expirationDate);
        return daysLeft >= 0 && daysLeft < 7;
    }
}