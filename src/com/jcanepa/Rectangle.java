package com.jcanepa;

public class Rectangle extends Shape
{
    protected final int base;
    private final int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    String getDrawing() {
        return "\u25ad";
    }

    /**
     * Return the total area in cm squared.
     */
    @Override
    public double getArea() {
        return base * height;
    }

    /**
     * Return the diameter length in cm.
     */
    @Override
    double getPerimeter() {
        return (2 * base)
                + (2 * height);
    }

    /**
     * Provide a string representation of essential
     * dimensions used to calculate area and perimeter.
     */
    @Override
    String getDimensions() {
        return "base: " + base +
                ", height: " + height;
    }
}
