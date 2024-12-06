public class Employee {
    //TODO: create employee class variables
    String name;
    int wage;
    boolean shouldRaise;
    String role;


    //TODO: create constructors
    public Employee(String name, String role, int wage, boolean shouldRaise) {
        this.name = name;
        this.role = role;
        this.wage = wage;
        this.shouldRaise = shouldRaise;
    }

    public Employee() {
        this.name = "Becky";
        this.role = "Being annoying";
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //TODO: any other methods?
    public void fire() {
        this.name = "Don't care";
        this.role = "Fired";
        this.wage = 0;
        this.shouldRaise = false;
    }

    //TODO: create main method test
    public String toString() {
        return "Name: " + name + "\nRole: "+ role +"\nWage: " + wage + "\nShould Raise?: " + shouldRaise + "\n";
    }

    public static void main(String[] args) {
        Employee becky = new Employee();
        System.out.println(becky);
        Employee notBecky = new Employee("Dude", "Being a Chad",  2121432, true);
        System.out.println(notBecky);
        notBecky.fire();
        System.out.println(notBecky);
    }

}



