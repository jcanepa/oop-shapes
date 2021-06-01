package com.jcanepa;

public class Square extends Rectangle
{
    public Square(int base) {
        super(base, base);
    }

    /**
     * Provide a string representation of essential
     * dimensions used to calculate area and perimeter.
     */
    @Override
    String getDimensions() {
        return "base: " + base;
    }

    @Override
    String getDrawing() {
        return "\u25fb";
    }
}
