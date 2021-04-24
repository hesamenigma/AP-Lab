/**
 * The shape class is class which hold main methods of shape
 * @author Hesam Ghazi
 * @version 0.0
 *
 */
package com.company;

public  class Circle extends Shape{
private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    @Override
    public void draw(){
        System.out.println("Circle");
        System.out.println("The radius of circle is equal to "+this.radius);
        System.out.println("The perimeter of circle is equal to "+calculatePerimeter());
        System.out.println("The area of circle is equal to "+calculateArea());
    }

    public boolean equals(Circle circle){
        if(this.radius == circle.radius){
       return true;
        }
        else{return false;}
    }
    @Override
    public String toString() {
        return "Circle with radius = " + this.radius;
    }
}
