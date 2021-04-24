/**
 * The shape class is class which hold main methods of shape
 * @author Hesam Ghazi
 * @version 0.0
 *
 */
package com.company;

import java.util.ArrayList;

public class Triangle extends Polygon {
    public Triangle(ArrayList<Double> sides) {
        super(sides);
    }
    public Triangle(String ... sides){
        super(sides);
    }
    public boolean isEquilateral(){
        /** This method use to check if triangle is equilateral or not by comparing it's 3 sides
         *
         */
        double sideOne = super.getSides().get(0);
        double sideTwo = super.getSides().get(1);
        double sideThree = super.getSides().get(2);
        if(sideOne == sideTwo && sideTwo == sideThree) return true;
        else return false;
    }
    @Override
    public double calculatePerimeter(){
        return super.getSides().get(0) + super.getSides().get(1) + super.getSides().get(1);
    }
    @Override
    public double calculateArea(){
        double s = (super.getSides().get(0) + super.getSides().get(1) + super.getSides().get(1) ) / 2;
        double sideOne = super.getSides().get(0);
        double sideTwo = super.getSides().get(1);
        double sideThree = super.getSides().get(2);
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }
    @Override
    public void draw(){
if(isEquilateral()) System.out.println("Equilateral triangle");
else System.out.println("Trinagle");
System.out.println("Side One is equal to "+ super.getSides().get(0));
System.out.println("Side two is equal to "+ super.getSides().get(1));
System.out.println("Side three is equal to "+ super.getSides().get(2));
System.out.println("The perimeter of triangle is equal to "+ calculatePerimeter());
System.out.println("The Area of triangle is equal to "+ calculateArea());


    }
    @Override
    public String toString() {
        return "Side one,two and three in order are " + super.getSides().get(0) + " ,"
                + super.getSides().get(1)+" ,"+super.getSides().get(2);
    }
}
