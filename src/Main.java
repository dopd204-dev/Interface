import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product[] warehouse = new Product[15];


        warehouse[0] = new ElectronicsProduct("iPhone 15", 1200, 3, 24, "Apple");
        warehouse[1] = new ElectronicsProduct("Galaxy S23", 1000, 7, 24, "Samsung");
        warehouse[2] = new ElectronicsProduct("ThinkPad X1", 1800, 2, 36, "Lenovo");
        warehouse[3] = new ElectronicsProduct("PlayStation 5", 600, 10, 12, "Sony");
        warehouse[4] = new ElectronicsProduct("Mi TV", 800, 6, 18, "Xiaomi");

        warehouse[5] = new FoodProduct("Milk", 2.5, 20,
                LocalDate.now().minusDays(2), true);

        warehouse[6] = new FoodProduct("Bread", 1.5, 15,
                LocalDate.now().plusDays(2), false);

        warehouse[7] = new FoodProduct("Cheese", 5.0, 10,
                LocalDate.now().plusDays(5), true);

        warehouse[8] = new FoodProduct("Yogurt", 3.0, 8,
                LocalDate.now().minusDays(1), true);

        warehouse[9] = new FoodProduct("Rice", 4.0, 12,
                LocalDate.now().plusDays(30), false);

        warehouse[10] = new ClothingProduct("Winter Jacket", 150, 5, "L", "Зима");
        warehouse[11] = new ClothingProduct("Summer T-Shirt", 25, 20, "M", "Лето");
        warehouse[12] = new ClothingProduct("Jeans", 60, 12, "XL", "Осень");
        warehouse[13] = new ClothingProduct("Sweater", 80, 7, "S", "Зима");
        warehouse[14] = new ClothingProduct("Shorts", 30, 14, "M", "Лето");

        System.out.println("=== ВСЕ ТОВАРЫ ===");
        WarehouseManager.displayAllProducts(warehouse);

        double totalValue = WarehouseManager.calculateTotalValue(warehouse);
        System.out.println("Общая стоимость склада: " + totalValue);


        System.out.println("\n=== ПРОСРОЧЕННЫЕ ТОВАРЫ ===");
        Product[] expired = WarehouseManager.findExpiredProducts(warehouse);
        for (Product p : expired) {
            System.out.println(p.getName());
        }


        double totalDiscount = WarehouseManager.calculateTotalDiscount(warehouse);
        System.out.println("\nОбщая экономия от скидок: " + totalDiscount);


        System.out.println("\n=== УСЛОВИЯ ХРАНЕНИЯ ===");
        WarehouseManager.printStorageRequirements(warehouse);


        System.out.println("\n=== САМЫЙ ДОРОГОЙ ТОВАР ===");
        Product mostExpensive = WarehouseManager.findMostExpensive(warehouse);
        if (mostExpensive != null) {
            mostExpensive.displayInfo();
        }


        Product[] electronics =
                WarehouseManager.findByType(warehouse, ElectronicsProduct.class);

        Product[] foods =
                WarehouseManager.findByType(warehouse, FoodProduct.class);

        Product[] clothes =
                WarehouseManager.findByType(warehouse, ClothingProduct.class);

        System.out.println("\nКоличество электроники: " + electronics.length);
        System.out.println("Количество продуктов: " + foods.length);
        System.out.println("Количество одежды: " + clothes.length);


        double avgDiscount = WarehouseManager.calculateAverageDiscount(warehouse);
        System.out.println("\nСредняя скидка по складу: " + avgDiscount + "%");
    }
}