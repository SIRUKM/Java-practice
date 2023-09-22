package Assigment5;

java.util.*;

// Quadrilateral class representing a generic quadrilateral
class Quadrilateral {
    private int x1, y1, x2, y2, x3, y3, x4, y4;

    // Constructor
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    // Getters and setters for the coordinates (if needed)

    // Method to calculate the area (generic for any quadrilateral)
    public double calculateArea() {
        // Implementation to calculate the area based on the coordinates
        // This can be done using different formulas depending on the type of
        // quadrilateral
        // double area = Math.abs(0.5* ( (x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 +
        // x3*y2 + x4*y3 + x1*y4)) );
        double area = Math.abs(0.5 * (x1 * (y1 - y2) + x2 * (y2 - y3) + x3 * (y3 - y1))
                + 0.5 * (x1 * (y3 - y4) + x3 * (y4 - y1) + x4 * (y1 - y3)));
        return area;
    }
}

// Trapezoid class, a subclass of Quadrilateral
class Trapezoid extends Quadrilateral {
    // Additional instance variables specific to Trapezoid if needed

    // Constructor
    public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Override the calculateArea method to calculate the area of a trapezoid

}

// Parallelogram class, a subclass of Quadrilateral
class Parallelogram extends Quadrilateral {
    // Additional instance variables specific to Parallelogram if needed

    // Constructor
    public Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Override the calculateArea method to calculate the area of a parallelogram

}

// Rectangle class, a subclass of Parallelogram
class Rectangle extends Parallelogram {
    // Additional instance variables specific to Rectangle if needed

    // Constructor
    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Override the calculateArea method to calculate the area of a rectangle

}

// Square class, a subclass of Rectangle
class Square extends Rectangle {
    // Additional instance variables specific to Square if needed

    // Constructor
    public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Override the calculateArea method to calculate the area of a square

}

public class q1 {
    public static void main(String[] args) {
        // Instantiate objects of your classes and calculate their areas
        Quadrilateral quadrilateral = new Quadrilateral(0, 0, 1, 0, 1, 1, 0, 1);
        double quadrilateralArea = quadrilateral.calculateArea();

        Trapezoid trapezoid = new Trapezoid(0, 0, 1, 0, 2, 2, -1, 2);
        double trapezoidArea = trapezoid.calculateArea();

        Parallelogram parallelogram = new Parallelogram(0, 0, 1, 0, 2, 2, -1, 2);
        double parallelogramArea = parallelogram.calculateArea();

        Rectangle rectangle = new Rectangle(0, 0, 1, 0, 1, 2, 0, 2);
        double rectangleArea = rectangle.calculateArea();

        Square square = new Square(0, 0, 1, 0, 1, 1, 0, 1);
        double squareArea = square.calculateArea();

        // Output the areas
        System.out.println("Quadrilateral Area: " + quadrilateralArea);
        System.out.println("Trapezoid Area: " + trapezoidArea);
        System.out.println("Parallelogram Area: " + parallelogramArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
    }
}
