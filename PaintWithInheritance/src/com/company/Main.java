/**
 * Polygon is a sub class of shape class which holds important fields of polygons like number of sides
 * @author Hesam Ghazi
 * @version 0.0
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Paint paint = new Paint();

        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        paint.addShape(circle1);
        paint.addShape(circle2);


        Rectangle rect1 = new Rectangle("1", "4", "1", "4");
        Rectangle rect2 = new Rectangle("8", "5", "8", "5");
        Rectangle rect3 = new Rectangle("6", "6", "6", "6");
        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rect3);

        Triangle tri1 = new Triangle("2", "2", "2");
        Triangle tri2 = new Triangle("4", "4", "6");
        paint.addShape(tri1);
        paint.addShape(tri2);

        paint.drawAll();
        paint.printAll();

    }
}
