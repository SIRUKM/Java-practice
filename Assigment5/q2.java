package Assigment5;

import java.util.Scanner;

class ThreeDObject {
    // Default constructor
    public ThreeDObject() {
    }

    // Method to calculate the whole surface area (generic for any 3D object)
    public double wholeSurfaceArea() {
        return 0.0;
    }

    // Method to calculate the volume (generic for any 3D object)
    public double volume() {
        return 0.0;
    }
}

class Box extends ThreeDObject {
    private double length, width, height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Override to calculate the surface area of the box
    @Override
    public double wholeSurfaceArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    // Override to calculate the volume of the box
    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends Box {
    // Constructor for a cube (all sides are equal)
    public Cube(double sideLength) {
        super(sideLength, sideLength, sideLength);
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override to calculate the surface area of the cylinder
    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Override to calculate the volume of the cylinder
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends Cylinder {
    // Constructor for a cone (a special case of a cylinder)
    public Cone(double radius, double height) {
        super(radius, height);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Box
        System.out.print("Enter the length of the box: ");
        double boxLength = scanner.nextDouble();
        System.out.print("Enter the width of the box: ");
        double boxWidth = scanner.nextDouble();
        System.out.print("Enter the height of the box: ");
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);

        // Input for Cube
        System.out.print("Enter the side length of the cube: ");
        double cubeSideLength = scanner.nextDouble();
        Cube cube = new Cube(cubeSideLength);

        // Input for Cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        // Input for Cone
        System.out.print("Enter the radius of the cone: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);

        // Calculate and display results
        System.out.println("\nBox Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("\nCube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Display results for cylinders
        System.out.println("\n Cylinders Total Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("\n Volume of Cylinders is: " + cylinder.volume());

        System.out.println("\n");
    }

}
