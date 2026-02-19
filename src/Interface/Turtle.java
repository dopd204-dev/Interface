package Interface;

public class Turtle implements Swimable {

    private String name;
    private double weight;

    public Turtle(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Ташбака жай жана тынч сузот.");
    }

    @Override
    public void showInfo() {
        System.out.println("Turtle | Аты: " + name + " | Салмагы: " + weight);
    }
}

