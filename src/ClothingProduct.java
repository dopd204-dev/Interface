public class ClothingProduct extends Product {
    private String size;
    private String season;

    public ClothingProduct(String name, double price, int quantity,
                           String size, String season) {

        super(name, price, quantity);

        this.size = size;
        this.season = season;
    }

    @Override
    public boolean isExpired() {
        return false;
    }



    @Override
    public double getDiscountedPrice() {

        String current = getCurrentSeason();

        if ((season.equalsIgnoreCase("Зима") && current.equalsIgnoreCase("Лето")) ||
                (season.equalsIgnoreCase("Лето") && current.equalsIgnoreCase("Зима"))) {

            return price * 0.7;
        }

        return price;
    }

    @Override
    public String getStorageConditions() {
        return "Хранить в сухом месте, защищенном от влаги и прямых солнечных лучей";
    }

    @Override
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена со скидкой: " + getDiscountedPrice());
        System.out.println("Количество: " + quantity);
        System.out.println("Размер: " + size);
        System.out.println("Сезон: " + season);
    }

    private String getCurrentSeason() {
        return "Зима";
    }
}