package Interface;

public class Shark implements Swimable {

    private String name;
    private int age;

    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Акула тез жана коркунучтуу сүзөт!");
    }

    @Override
    public void showInfo() {
        System.out.println("Shark | Аты: " + name + " | Жашы: " + age);
    }
}
