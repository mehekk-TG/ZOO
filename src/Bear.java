public class Bear extends Animal {
    boolean stronk;

    public Bear(String name, boolean hungry, double weight, int age, boolean stronk) {
        super(name, "Bear", age, weight, hungry);
        this.stronk = stronk;
    }


    public Bear() {
        super("Behr", "Bear", 23, 500.0, true);
        this.stronk = true;
    }

    public boolean isStronk() {
        return stronk;
    }

    public void setStronk(boolean stronk) {
        this.stronk = stronk;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStronk: " + stronk;
    }


    public void poke() {
        System.out.println("You poked the bear (" + this.name + ") with a stick.");
    }
}
