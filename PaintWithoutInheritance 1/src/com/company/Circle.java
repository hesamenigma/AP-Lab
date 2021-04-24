package com.company;
import org.w3c.dom.ls.LSOutput;
import java.util.Objects;
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public void draw() {
        System.out.println("Circle");
        System.out.println("The radius of circle is equal to " + this.radius);
        System.out.println("The perimeter of circle is equal to " + calculatePerimeter());
        System.out.println("The area of circle is equal to " + calculateArea());
    }

    public boolean equals(Circle circle) {
        if (this.radius == circle.radius) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}