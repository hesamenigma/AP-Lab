/**
 * The shape class is class which hold main methods of shape
 * @author Hesam Ghazi
 * @version 0.0
 *
 */
package com.company;
import java.util.ArrayList;
public class Paint {
    private  ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        this.shapes.add(shape);
    }

    public void drawAll() {
        for (Shape shape : this.shapes) {
            shape.draw();
        }
    }
    public void printAll() {
        for (Shape shape : this.shapes) {
            System.out.println(shape);
        }
    }
}
