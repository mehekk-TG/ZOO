public class Animal {


    //what information does each animal need?
    protected String name;
    protected String species;
    protected int age;
    protected double weight;
    protected boolean hungry;


    //do I need to fill all instance variables for a class?
    public Animal(String name, String species, int age, double weight, boolean hungry) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.hungry = hungry;


    }
    public Animal() {
        this.name = "Dook";
        this.species = "Duck";
        this.age = 5000;
        this.weight = 4.0;
        this.hungry = true;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String toString() {
        return "Name: " + this.name + "\nSpecies: " + this.species + "\nWeight: " + this.weight + "\nHungry: " + hungry + "\nAge: " + age;

    }


    public String speak() {
        return "Quack";
    }

    public void trick(String treat, String progressiveVerb) {
        System.out.println("You gave " + this.name + " a treat and it started " + progressiveVerb + ".");
    }
}