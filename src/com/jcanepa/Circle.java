package com.jcanepa;

public class Circle extends Shape{
    private final int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    String getDrawing() {
        return "\u25ef";
    }

    /**
     * Return the total area in cm squared.
     */
    @Override
    public double getArea()
    {
        return Math.PI * (radius * radius);
    }

    /**
     * Return the diameter length in cm.
     */
    @Override
    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * Provide a string representation of essential
     * dimensions used to calculate area and perimeter.
     */
    @Override
    String getDimensions() {
        return "radius: " + radius;
    }
}
