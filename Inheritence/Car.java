package Inheritence;
// Child class of class Vehicle

public class Car extends Vehical {
    String color = " ";
    int tyres = 0;

    public Car(int c, int m, String col, int ty) {
        super(c, m);
        color = col;
        tyres = ty;
    }

    public void show_car_details() {
        System.out.println("I am a car");
        System.out.println("The color of the car is " + color);
        System.out.println("The number of tyres are " + tyres);
    }
}
