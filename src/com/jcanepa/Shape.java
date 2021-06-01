package com.jcanepa;

abstract class Shape implements Drawable, Comparable<Shape>
{
    @Override
    public String draw() {
        return getDrawing();
    }

    public String getShapeType()
    {
        return getClass().getSimpleName();
    }

    abstract String getDrawing();

    /**
     * Return the total area in cm squared.
     */
    abstract double getArea();

    /**
     * Return the perimeter length in cm.
     */
    abstract double getPerimeter();

    /**
     * Provide a string representation of essential
     * dimensions used to calculate area and perimeter.
     */
    abstract String getDimensions();

    /**
     * Compare shapes by their area values.
     * @param o Another shape to compare against.
     * @return A negative value if this object is less, 0 if equal or a positive value if this object is greater.
     */
    @Override
    public int compareTo(Shape o) {
        return (int)this.getArea() - (int)o.getArea();
    }

    @Override
    public String toString() {
        return getShapeType() + "[" +
                getDimensions() + "]" + " has a perimeter of " +
                getPerimeter() + " cm and an area of " + getArea() + " cm\u00B2";
    }
}
