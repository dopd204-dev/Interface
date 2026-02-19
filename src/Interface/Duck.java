package Interface;

public class Duck implements Swimable {

    private String name;
    private String color;

    public Duck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println("Өрдөк жай сүзөт жана калкып сузот.");
    }

    @Override
    public void showInfo() {
        System.out.println("Duck | Аты: " + name + " | Түсү: " + color);
    }
}
