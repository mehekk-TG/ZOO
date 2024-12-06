import java.util.LinkedList;

public class Zoo {
    LinkedList <Animal> animals = new LinkedList<Animal>();
    LinkedList <Employee> employees = new LinkedList<Employee>();

    boolean open;
    int money;


    public Zoo(boolean open, int money) {
        this.open = open;
        this.money = money;
    }

    public Zoo() {
        this.open = true;
        this.money = 1000000;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void
}
