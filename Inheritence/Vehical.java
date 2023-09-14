package Inheritence;
// Parent class

public class Vehical {
    int cost = 0;
    int milage = 0;

    public Vehical(int c, int m) {
        cost = c;
        milage = m;
    }

    public void show_vehicle_details() {
        System.out.println("I am a Vehicle");
        System.out.println("The cost of vechicle is " + cost);
        System.out.println("The milage of vechilce is " + milage);
    }
}
