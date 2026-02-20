public class WarehouseManager {

    public static double calculateTotalValue(Product[] products) {
        double total = 0;

        for (Product p : products) {
            total += p.getTotalValue();
        }

        return total;
    }

    public static Product[] findExpiredProducts(Product[] products) {

        int count = 0;
        for (Product p : products) {
            if (p.isExpired()) {
                count++;
            }
        }

        Product[] expired = new Product[count];

        int index = 0;
        for (Product p : products) {
            if (p.isExpired()) {
                expired[index++] = p;
            }
        }

        return expired;
    }

    public static void displayAllProducts(Product[] products) {

        for (Product p : products) {
            p.displayInfo();
            System.out.println("---");
        }
    }

    public static double calculateTotalDiscount(Product[] products) {

        double totalDiscount = 0;

        for (Product p : products) {
            double originalPrice = p.getPrice() * p.getQuantity();
            double discountedPrice = p.getTotalValue();
            totalDiscount += (originalPrice - discountedPrice);
        }

        return totalDiscount;
    }

    public static void printStorageRequirements(Product[] products) {

        for (Product p : products) {
            System.out.println(p.getName() + ": " + p.getStorageConditions());
        }
    }

    public static Product findMostExpensive(Product[] products) {

        if (products == null || products.length == 0) {
            return null;
        }

        Product most = products[0];

        for (Product p : products) {
            if (p.getDiscountedPrice() > most.getDiscountedPrice()) {
                most = p;
            }
        }

        return most;
    }

    public static Product[] findByType(Product[] products, Class<?> type) {

        int count = 0;
        for (Product p : products) {
            if (type.isInstance(p)) {
                count++;
            }
        }

        Product[] result = new Product[count];

        int index = 0;
        for (Product p : products) {
            if (type.isInstance(p)) {
                result[index++] = p;
            }
        }

        return result;
    }

    public static double calculateAverageDiscount(Product[] products) {

        if (products == null || products.length == 0) {
            return 0;
        }

        double totalPercent = 0;

        for (Product p : products) {
            if (p.getPrice() > 0) {
                double discount =
                        (p.getPrice() - p.getDiscountedPrice())
                                / p.getPrice() * 100;

                totalPercent += discount;
            }
        }

        return totalPercent / products.length;
    }
}