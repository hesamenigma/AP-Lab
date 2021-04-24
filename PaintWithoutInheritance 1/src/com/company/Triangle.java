package com.company;
import java.util.ArrayList;
import java.util.Objects;
public class Triangle {
    private ArrayList<Double> sides = new ArrayList<>();

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sides.add(sideOne);
        this.sides.add(sideTwo);
        this.sides.add(sideThree);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public double calculatePerimeter() {
        return this.sides.get(0) + this.sides.get(1) + this.sides.get(2);
    }

    public double calculateArea() {
        double s = (this.sides.get(0) + this.sides.get(1) + this.sides.get(2)) / 2;
        return Math.sqrt(s * (s - this.sides.get(0)) * (s - this.sides.get(1)) * (s - this.sides.get(2)));
    }

    public boolean isEquilateral() {
        double sideOne = this.sides.get(0);
        double sideTwo = this.sides.get(1);
        double sideThree = this.sides.get(2);
        if (sideOne == sideTwo && sideTwo == sideThree) {
            return true;
        } else {
            return false;
        }
    }

    public void draw() {
        if (isEquilateral()) {
            System.out.println("Equilateral triangle"); }
        else { System.out.println("Non-Equilateral triangle"); }
        System.out.println("Side one is equal to "+ this.sides.get(0));
        System.out.println("Side two is equal to "+ this.sides.get(1));
        System.out.println("Side three is equal to "+ this.sides.get(2));
        System.out.println("The perimeter of circle is equal to "+ calculatePerimeter());
        System.out.println("The area of circle is equal to "+ calculateArea());
    }
    public boolean equals(Triangle triangle){
        if(this.sides == triangle.sides){
            return true;
        }
        else {return false;}
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides.toString() +
                '}';
    }
}