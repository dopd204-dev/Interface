public class WarehouseManager {

    // Рассчитывает общую стоимость всех товаров с учетом скидок
    // ПОЛИМОРФИЗМ: автоматически вызовет правильный getDiscountedPrice()
    // у каждого наследника свой!
    public static double calculateTotalValue(Product[] products) {
        // TODO: пройти по массиву
        // TODO: для каждого товара вызвать getTotalValue()
        // TODO: суммировать и вернуть результат
        return 0;
    }

    // Находит все просроченные товары
    // ПОЛИМОРФИЗМ: вызовет isExpired() для каждого товара
    // у FoodProduct — проверяет дату, у остальных — всегда false
    public static Product[] findExpiredProducts(Product[] products) {
        // TODO: первый проход — посчитать количество просроченных
        // TODO: создать массив нужного размера
        // TODO: второй проход — заполнить массив просроченными товарами
        return null;
    }

    // Выводит информацию обо всех товарах
    // ПОЛИМОРФИЗМ: каждый тип выведет свою информацию через displayInfo()
    public static void displayAllProducts(Product[] products) {
        // TODO: пройти по массиву
        // TODO: для каждого товара вызвать displayInfo()
        // TODO: вывести разделитель "---" между товарами
    }

    // Считает общую экономию от всех скидок
    public static double calculateTotalDiscount(Product[] products) {
        // TODO: для каждого товара:
        // TODO:   originalPrice = getPrice() * getQuantity()
        // TODO:   discountedPrice = getTotalValue()
        // TODO:   экономия = originalPrice - discountedPrice
        // TODO: суммировать всю экономию и вернуть
        return 0;
    }

    // Выводит условия хранения для каждого товара
    // ПОЛИМОРФИЗМ: у каждого наследника своя реализация getStorageConditions()
    public static void printStorageRequirements(Product[] products) {
        // TODO: для каждого товара вывести:
        // TODO: getName() + ": " + getStorageConditions()
    }

    // Находит самый дорогой товар (по цене со скидкой)
    public static Product findMostExpensive(Product[] products) {
        // TODO: найти товар с максимальным getDiscountedPrice()
        // Подсказка: заведите переменную Product most = products[0]
        // и сравнивайте в цикле
        return null;
    }

    // Находит все товары определённого типа
    // INSTANCEOF: проверяет, является ли объект экземпляром нужного класса
    public static Product[] findByType(Product[] products, Class<?> type) {
        // TODO: первый проход — посчитать сколько товаров нужного типа
        //       Подсказка: type.isInstance(products[i])
        // TODO: создать массив нужного размера
        // TODO: второй проход — заполнить массив
        return null;
    }

    // Считает среднюю скидку по всему складу в процентах
    public static double calculateAverageDiscount(Product[] products) {
        // TODO: для каждого товара посчитать скидку в процентах:
        // TODO:   discount = (getPrice() - getDiscountedPrice()) / getPrice() * 100
        // TODO: вернуть среднее значение по всем товарам
        return 0;
    }
}