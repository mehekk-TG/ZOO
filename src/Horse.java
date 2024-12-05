public class Horse extends Animal{
    protected int mph;

    public Horse(String name, boolean hungry, double weight, int age, int mph) {
        this.setName(name);
        this.setHungry(hungry);
        this.setWeight(weight);
        this.setAge(age);
        this.setSpecies("Horse");
        this.mph = mph;
    }


    public int getMph() {
        return mph;
    }


    public void setMph(int mph) {
        this.mph = mph;
    }


    public String speak() {
        return "Neigh";
    }

    public void ride() {
        System.out.println("You rode for " +(int)( Math.random() * 500) + " miles.");
    }

    public String toString() {
        return "Name: " + this.name + "\nSpecies: " + this.species + "\nWeight: " + this.weight + "\nHungry: " + hungry + "\nAge: " + age + "\nMPH: " + mph;
    }
}
