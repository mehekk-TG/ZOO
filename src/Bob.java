public class Bob extends Employee{

    int id;

    public Bob(int wage, boolean shouldRaise, int id){
        super("Bob", "Menial Laborer", wage, shouldRaise);
        this.id = id;
    }

    public Bob() {
        super("Bob", "Menial Laborer", 1, false);
        this.id = 142;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void commandBob(String progressiveVerb) {
        System.out.println("Bob-" + id + " is now " + progressiveVerb);
    }

    public String toString() {
        return "Name: " + name + "\nID: " + id +"\nRole: "+ role +"\nWage: " + wage + "\nShould Raise?: " + shouldRaise + "\n";
    }
}
