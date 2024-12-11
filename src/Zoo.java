import java.util.LinkedList;




public class Zoo {
    static float time = 5;
    static int openTime = 8;
    static int closeTime = 20;

    LinkedList <Animal> animals = new LinkedList<Animal>();
    LinkedList <Employee> employees = new LinkedList<Employee>();


    int money;


    public Zoo(int money) {

        this.money = money;
    }

    public Zoo() {

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

    public static float getTime() {
        return time;
    }

    public static void setTime(float time) {
        Zoo.time = time;
    }

    public static int getOpenTime() {
        return openTime;
    }

    public static void setOpenTime(int openTime) {
        Zoo.openTime = openTime;
    }

    public static int getCloseTime() {
        return closeTime;
    }

    public static void setCloseTime(int closeTime) {
        Zoo.closeTime = closeTime;
    }
    public static boolean isOpen() {
        if (time >= openTime && time < closeTime) {
            return true;
        }
        return false;
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

        return string;
    }

    @Override
    public String toString() {
        return "Money: " + money + "\n" + getAnimals() + "\n" + getEmployees();
    }


    public void performance() {
        System.out.println(animals.get((int) (Math.random() * (animals.size()))).name + " is doing a jig.");
    }




}
