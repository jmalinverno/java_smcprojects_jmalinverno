package com.mycompany.inheritance;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * InheritanceAssignment
 * @author jmalinverno
 */

// Abstract base class used for a generic shape
abstract class Shape {
    public abstract double area(); // Method to calculate the area of a shape
}

// Class for a rectangle, derived from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the rectangle with its dimensions
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override // Override to calculate the area of the rectangle
    public double area() {
        return getLength() * getWidth();
    }

    @Override // Override toString for the output
    public String toString() {
        return "Rectangle's area: " + String.format("%.2f", area());
    }
}

// Class for a square, derived from Shape
class Square extends Shape {
    private double side;

    // Constructor to initialize the square with its side length
    public Square(double side) {
        setSide(side);
    }

    // Getter and setter 
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override // Override to calculate the area of the square
    public double area() {
        return Math.pow(getSide(), 2);
    }

    @Override // Override toString for the output
    public String toString() {
        return "Square's area: " + String.format("%.2f", area());
    }
}

// Class for a circle, derived from Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the circle with its radius
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override // Override to calculate the area of the circle
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override // Override toString for the output
    public String toString() {
        return "Circle's area: " + String.format("%.2f", area());
    }
}

public class Inheritance {
    private static ArrayList<Shape> shapes = new ArrayList<>(); // List to store the created shapes
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int uChoice;
        do {
            // Menu options to the user
            System.out.println("1. Create a rectangle");
            System.out.println("2. Create a square");
            System.out.println("3. Create a circle");
            System.out.println("4. Print the shapes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            uChoice = scanner.nextInt();

            switch (uChoice) {
                case 1:
                    createRectangle();
                    break;
                case 2:
                    createSquare();
                    break;
                case 3:
                    createCircle();
                    break;
                case 4:
                    printShapes();
                    break;
            }
            System.out.println();
        } while (uChoice != 5);
    }

    // Method to create a rectangle and add it to the list
    private static void createRectangle() {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        shapes.add(new Rectangle(length, width));
    }

    // Method to create a square and add it to the list
    private static void createSquare() {
        System.out.print("Enter side: ");
        double side = scanner.nextDouble();
        shapes.add(new Square(side));
    }

    // Method to create a circle and add it to the list
    private static void createCircle() {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        shapes.add(new Circle(radius));
    }

    // Method to print all the shapes stored in the list
    private static void printShapes() {
        if (shapes.isEmpty()) {
            System.out.println("No shapes created yet.");
        } else {
            for (int i = 0; i < shapes.size(); i++) {
                System.out.println(shapes.get(i));
            }
        }
    }
}