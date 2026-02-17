public class ClothingProduct extends Product {
    private String size;
    private String season;

    public ClothingProduct(String name, double price, int quantity,
                           String size, String season) {
        // TODO: вызвать конструктор родителя
        // TODO: инициализировать свои поля
    }

    // Одежда не портится — реализация уже дана, объяснить почему именно так
    @Override
    public boolean isExpired() {
        return false;
    }

    // РЕАЛИЗОВАТЬ: сезонная распродажа — скидка 30% на одежду не в сезон
    @Override
    public double getDiscountedPrice() {
        // TODO: получить текущий сезон через getCurrentSeason()
        // TODO: если season == "Зима" и текущий == "Лето", скидка 30%
        // TODO: если season == "Лето" и текущий == "Зима", скидка 30%
        // TODO: иначе обычная цена
        return 0;
    }

    // РЕАЛИЗОВАТЬ: условия хранения одежды
    @Override
    public String getStorageConditions() {
        // TODO: вернуть подходящую строку условий хранения одежды
        return "";
    }

    // РЕАЛИЗОВАТЬ: вывести инфо + размер и сезон
    @Override
    public void displayInfo() {
        // TODO: вывести название, цену со скидкой, количество
        // TODO: вывести размер и сезон
    }

    private String getCurrentSeason() {
        return "Зима"; // упрощение для задания
    }
}