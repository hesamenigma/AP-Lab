/**
 * The shape class is class which hold main methods of shape
 * @author Hesam Ghazi
 * @version 0.0
 *
 */

package com.company;
import java.util.ArrayList;
public  class Rectangle extends Polygon {
    public Rectangle(ArrayList<Double> sides) {
        super(sides);
    }
    public Rectangle(String ... sides){
        super(sides);
    }
    @Override
    public double calculatePerimeter(){
        double sideOne = super.getSides().get(0);
        double sideTwo = super.getSides().get(1);
        double sideThree = super.getSides().get(2);
        double sideFour = super.getSides().get(3);
        return sideOne + sideTwo + sideThree + sideFour;
    }
    @Override
    public double calculateArea(){
        double sideOne = super.getSides().get(0);
        double sideTwo = super.getSides().get(1);
        double sideThree = super.getSides().get(2);
        double sideFour = super.getSides().get(3);
        if(sideOne == sideTwo){ return sideOne * sideThree; }
        else if(sideOne == sideThree){ return sideOne * sideFour; }
        else { return sideOne * sideTwo; }
    }
    public boolean isSquare(){
        double sideOne = super.getSides().get(0);
        double sideTwo = super.getSides().get(1);
        double sideThree = super.getSides().get(2);
        double sideFour = super.getSides().get(3);
        if(sideOne == sideTwo && sideTwo == sideThree && sideThree == sideFour){ return true; }
        else {return false;}
    }
    @Override
    public void draw(){
        /** this method use to print all details of rectangle like sides,type,perimeter and area
         *
         */
        if(isSquare()) System.out.println("Square");
else System.out.println("Rectangle");
        System.out.println("Side One is equal to "+ super.getSides().get(0));
        System.out.println("Side two is equal to "+ super.getSides().get(1));
        System.out.println("Side three is equal to "+ super.getSides().get(2));
        System.out.println("Side four is equal to "+ super.getSides().get(3));
        System.out.println("The perimeter of rectangle is equal to "+ calculatePerimeter());
        System.out.println("The area of rectangle is equal to "+ calculateArea());
    }
    @Override
    public String toString() {
        return "Side one,two,three and four in order are " + super.getSides().get(0) + " ,"
                + super.getSides().get(1)+" ,"+super.getSides().get(2)+ " ,"+ super.getSides().get(3);
    }
    public boolean equal(Rectangle rectangle){
        /** This method use to compare two rectangle and detect if they are same or not
         * @param rectangle This is a rectangle which we want to compare
         */
        if(rectangle.getSides() == this.getSides()){
            return true;
        }else return false;
    }
}
