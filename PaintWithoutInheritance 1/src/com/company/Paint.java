package com.company;
import java.util.ArrayList;
public class Paint {
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public ArrayList<Circle> getCircles(){
        return circles;
    }
    public ArrayList<Triangle> getTriangle(){
        return triangles;
    }
    public ArrayList<Rectangle> getRectangles(){
        return rectangles;
    }
    public void addCircle(Circle circle){
        this.circles.add(circle);
    }
    public void addTriangle(Triangle triangle){
        this.triangles.add(triangle);
    }
    public void addRectangle(Rectangle rectangle){
        this.rectangles.add(rectangle);
    }
    public void drawAll(){
        for(Circle circle : circles){
            circle.draw();
        }
        for(Triangle triangle : triangles){
            triangle.draw();
        }

        for(Rectangle rectangle : rectangles){
            rectangle.draw();
        }

    }
    public void printAll(){
        for(Circle circle : circles){
            System.out.println(circle);
        }
        for(Triangle triangle : triangles){
            System.out.println(triangle);
        }

        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
