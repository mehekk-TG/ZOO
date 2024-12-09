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

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        employees.remove(employee);
    }


    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getAnimals() {
        String string = "Animals:\n\n";

        for (int i = 0; i < animals.size(); i++) {
           string += animals.get(i).toString() + "\n\n";
        }

        string += "\n";

        return string;
    }

    public String getEmployees() {
        String string = "Employees:\n\n";

        for (int i = 0; i < employees.size(); i++) {
            string += employees.get(i).toString() + "\n";
        }

        string += "\n";

        return string;
    }

    @Override
    public String toString() {
        return "Open: " + open + "\nMoney: " + money + "\n" + getAnimals() + "\n" + getEmployees();
    }
}
