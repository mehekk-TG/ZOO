public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Animal());
        zoo.addAnimal(new Animal("Abablah", "Goose", 21, 32132.3, false));
        zoo.addAnimal(new Animal("Amorgus", "Dragon", 12239, 13423.4, true));

        System.out.println(zoo.getAnimals());

        zoo.hireEmployee(new Employee());
        zoo.hireEmployee(new Bob());

        System.out.println(zoo.getEmployees());

        System.out.println(Zoo.isOpen());


        zoo.performance();
    }
}