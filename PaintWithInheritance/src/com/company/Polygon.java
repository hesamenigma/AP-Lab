
/**
 * Polygon is a sub class of shape class which holds important fields of polygons like number of sides
 * @author Hesam Ghazi
 * @version 0.0
 */
package com.company;
import java.util.ArrayList;

public abstract class Polygon extends Shape {
    private final ArrayList<Double> sides;
    public Polygon(ArrayList<Double> sides) {
        this.sides = sides;
    }
    public Polygon(String... sides) {
        this.sides = new ArrayList<>();

        for (String sideString : sides) {
            this.sides.add(Double.parseDouble(sideString));
        }
    }
    public ArrayList<Double> getSides() {
        return sides;
    }
    @Override
    public double calculatePerimeter() {
        return this.sides.stream()
                .mapToDouble(side -> side)
                .sum();
    }
}
