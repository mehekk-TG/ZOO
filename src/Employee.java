public class Employee {
    //TODO: create employee class variables
    String name;
    int wage;
    boolean shouldRaise;


    //TODO: create constructors
    public Employee(String name, int wage, boolean shouldRaise) {
        this.name = name;
        this.wage = wage;
        this.shouldRaise = shouldRaise;
    }

    public Employee() {
        this.name = "Becky";
        this.wage = 1;
        this.shouldRaise = false;
    }
    //TODO: create getters and setters

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }
    public boolean shouldRaise() {
        return shouldRaise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setShouldRaise(boolean shouldRaise) {
        this.shouldRaise = shouldRaise;
    }

    //TODO: any other methods?
    public void fire() {
        this.name = "Don't care";
        this.wage = 0;
        this.shouldRaise = false;
    }

    //TODO: create main method test
    public String toString() {
        return "Name: " + name + "\nWage: " + wage + "\nShould Raise?: " + shouldRaise + "\n";
    }

    public static void main(String[] args) {
        Employee becky = new Employee();
        System.out.println(becky);
        Employee notBecky = new Employee("Dude", 2121432, true);
        System.out.println(notBecky);
        notBecky.fire();
        System.out.println(notBecky);
    }

}



