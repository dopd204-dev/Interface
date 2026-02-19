package Interface;

public class Oceanarium {

    private Swimable[] animals;

    public Oceanarium(Swimable[] animals) {
        this.animals = animals;
    }

    public Swimable[] getAnimals() {
        return animals;
    }

    public void setAnimals(Swimable[] animals) {
        this.animals = animals;
    }

    public void showAllAnimals() {
        for (Swimable animal : animals) {
            animal.showInfo();
            animal.swim();
            System.out.println("-------------------");
        }
    }
}
