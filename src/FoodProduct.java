import java.time.LocalDate;

public class FoodProduct extends Product {
    private LocalDate expirationDate;
    private boolean requiresRefrigeration;
    // true = нужен холодильник (молоко, мясо)
    // false = не нужен (хлеб, крупы)

    public FoodProduct(String name, double price, int quantity,
                       LocalDate expirationDate, boolean requiresRefrigeration) {
        // TODO: вызвать конструктор родителя
        // TODO: инициализировать свои поля
    }

    // РЕАЛИЗОВАТЬ: скидка 50% если срок годности истекает скоро
    @Override
    public double getDiscountedPrice() {
        // TODO: если isExpiringSoon() == true, вернуть price * 0.5
        // иначе обычную цену
        return 0;
    }

    // РЕАЛИЗОВАТЬ: проверка срока годности
    @Override
    public boolean isExpired() {
        // TODO: сравнить expirationDate с текущей датой
        // если expirationDate < LocalDate.now() вернуть true
        return false;
    }

    // РЕАЛИЗОВАТЬ: условия хранения зависят от requiresRefrigeration
    @Override
    public String getStorageConditions() {
        // TODO: если requiresRefrigeration == true
        //       вернуть "Хранить в холодильнике при 0-4°C"
        //       иначе "Хранить в сухом прохладном месте"
        return "";
    }

    // РЕАЛИЗОВАТЬ: вывести инфо + предупреждение если просрочено
    @Override
    public void displayInfo() {
        // TODO: вывести название, цену со скидкой, количество
        // TODO: вывести срок годности и требования к холодильнику
        // TODO: если isExpired() == true, вывести "⚠ ПРОСРОЧЕНО!"
    }

    // Вспомогательный метод — реализовать самостоятельно
    private boolean isExpiringSoon() {
        // TODO: вернуть true если до expirationDate осталось меньше 7 дней
        // Подсказка: используйте ChronoUnit.DAYS.between(LocalDate.now(), expirationDate)
        return false;
    }
}