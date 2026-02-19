package Interface;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark("Jaws", 7);

        Duck[] ducks = {
                new Duck("Duck1", "Ак"),
                new Duck("Duck2", "Сары"),
                new Duck("Duck3", "Кара"),
                new Duck("Duck4", "Көк"),
                new Duck("Duck5", "Жашыл")
        };

        Turtle[] turtles = {
                new Turtle("Turtle1", 5.5),
                new Turtle("Turtle2", 6.0),
                new Turtle("Turtle3", 4.8),
                new Turtle("Turtle4", 7.2),
                new Turtle("Turtle5", 5.9)
        };

        Swimable[] oceanAnimals = new Swimable[11];

        oceanAnimals[0] = shark;

        for (int i = 0; i < 5; i++) {
            oceanAnimals[i + 1] = ducks[i];
            oceanAnimals[i + 6] = turtles[i];
        }

        Oceanarium oceanarium = new Oceanarium(oceanAnimals);
        oceanarium.showAllAnimals();

    }
}
