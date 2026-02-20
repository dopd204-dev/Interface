public class ElectronicsProduct extends Product {
    private int warrantyMonths;
    private String brand;

    public ElectronicsProduct(String name, double price, int quantity,
                              int warrantyMonths, String brand) {

        super(name, price, quantity);

        this.warrantyMonths = warrantyMonths;
        this.brand = brand;
    }

    @Override
    public boolean isExpired() {
        return false;
    }



    @Override
    public double getDiscountedPrice() {
        if (quantity > 5) {
            return price * 0.9;
        }
        return price;
    }

    @Override
    public String getStorageConditions() {
        return "Сухое помещение, температура 15-25°C";
    }

    @Override
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена со скидкой: " + getDiscountedPrice());
        System.out.println("Количество: " + quantity);
        System.out.println("Бренд: " + brand);
        System.out.println("Гарантия: " + warrantyMonths + " месяцев");
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}