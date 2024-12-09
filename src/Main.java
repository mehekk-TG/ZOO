public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Animal());
        zoo.addAnimal(new Animal());

        System.out.println(zoo.getAnimals());

        zoo.hireEmployee(new Employee());
        zoo.hireEmployee(new Bob());

        System.out.println(zoo.getEmployees());

        System.out.println(zoo);
    }
}