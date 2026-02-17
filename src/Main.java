public class Main {
    public static void main(String[] args) {

        // 1. Создайте массив для хранения товаров
        Product[] warehouse = new Product[15];

        // ПОДСКАЗКА: new Product() — вызовет ошибку компиляции, почему?
        // Product является абстрактным классом — нельзя создать напрямую!

        // 2. Заполните массив разными типами товаров:

        // 5 ElectronicsProduct (разные бренды, гарантии, количества)
        // TODO: warehouse[0] = new ElectronicsProduct(...)
        // TODO: warehouse[1] = new ElectronicsProduct(...)
        // TODO: warehouse[2] = new ElectronicsProduct(...)
        // TODO: warehouse[3] = new ElectronicsProduct(...)
        // TODO: warehouse[4] = new ElectronicsProduct(...)

        // 5 FoodProduct (разные сроки годности, хотя бы 2 просроченных)
        // TODO: warehouse[5] = new FoodProduct(...)
        // TODO: warehouse[6] = new FoodProduct(...)
        // TODO: warehouse[7] = new FoodProduct(...)
        // TODO: warehouse[8] = new FoodProduct(...)
        // TODO: warehouse[9] = new FoodProduct(...)

        // 5 ClothingProduct (разные размеры и сезоны)
        // TODO: warehouse[10] = new ClothingProduct(...)
        // TODO: warehouse[11] = new ClothingProduct(...)
        // TODO: warehouse[12] = new ClothingProduct(...)
        // TODO: warehouse[13] = new ClothingProduct(...)
        // TODO: warehouse[14] = new ClothingProduct(...)

        // 3. Выведите информацию обо ВСЕХ товарах
        // ПОЛИМОРФИЗМ: один метод — разный вывод для каждого типа!
        // TODO: вызвать WarehouseManager.displayAllProducts(warehouse)

        // 4. Посчитайте и выведите общую стоимость склада с учетом скидок
        // TODO: вызвать WarehouseManager.calculateTotalValue(warehouse)
        // TODO: вывести результат

        // 5. Найдите и выведите все просроченные товары
        // TODO: вызвать WarehouseManager.findExpiredProducts(warehouse)
        // TODO: пройти по результату и вывести название каждого товара

        // 6. Посчитайте и выведите общую экономию от всех скидок
        // TODO: вызвать WarehouseManager.calculateTotalDiscount(warehouse)
        // TODO: вывести результат

        // 7. Выведите условия хранения для всех товаров
        // TODO: вызвать WarehouseManager.printStorageRequirements(warehouse)

        // 8. Найдите и выведите самый дорогой товар
        // TODO: вызвать WarehouseManager.findMostExpensive(warehouse)
        // TODO: вызвать displayInfo() у найденного товара

        // 9. Найдите товары определённого типа через instanceof
        // TODO: вызвать WarehouseManager.findByType(warehouse, ElectronicsProduct.class)
        // TODO: вызвать WarehouseManager.findByType(warehouse, FoodProduct.class)
        // TODO: вызвать WarehouseManager.findByType(warehouse, ClothingProduct.class)
        // TODO: вывести количество найденных товаров каждого типа

        // 10. Посчитайте и выведите среднюю скидку по складу
        // TODO: вызвать WarehouseManager.calculateAverageDiscount(warehouse)
        // TODO: вывести результат в процентах
    }
}