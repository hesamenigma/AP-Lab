package com.company;

import java.util.ArrayList;
import java.util.Objects;
public class Rectangle {
    private ArrayList<Double> sides = new ArrayList<>();
    public Rectangle(double sideOne,double sideTwo,double sideThree,double sideFour){
        this.sides.add(sideOne);
        this.sides.add(sideTwo);
        this.sides.add(sideThree);
        this.sides.add(sideFour);
    }
    public ArrayList<Double> getSides() {
        return sides;
    }
    public double calculatePerimeter(){
        return this.sides.get(0) + this.sides.get(1) + this.sides.get(2) + this.sides.get(3);
    }
    public double calculateArea(){
        double sideOne =  sides.get(0);
        double sideTwo =  sides.get(1);
        double sideThree =  sides.get(2);
        double sideFour =  sides.get(3);
        if(sideOne == sideTwo){ return sideOne * sideThree; }
        else if(sideOne == sideThree){ return sideOne * sideFour; }
        else { return sideOne * sideTwo; }
    }
    public boolean isSquare(){
        double sideOne =  sides.get(0);
        double sideTwo =  sides.get(1);
        double sideThree =  sides.get(2);
        double sideFour =  sides.get(3);
        if(sideOne == sideTwo && sideTwo == sideThree && sideThree == sideFour){return true;}
        else{return false;}
    }
    public void draw(){
        if(isSquare()){System.out.println("Square"); }
        else{ System.out.println("Rectangle"); }
        System.out.println("Side one is equal to "+ this.sides.get(0));
        System.out.println("Side two is equal to "+ this.sides.get(1));
        System.out.println("Side three is equal to "+ this.sides.get(2));
        System.out.println("Side four is equal to "+ this.sides.get(3));
        System.out.println("The perimeter of circle is equal to "+ calculatePerimeter());
        System.out.println("The area of circle is equal to "+ calculateArea());
    }
    public boolean equals(Rectangle rectangle){
        if(this.sides == rectangle.sides){
            return true;
        }
        else {return false;}
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides.toString() +
                '}';
    }
}
