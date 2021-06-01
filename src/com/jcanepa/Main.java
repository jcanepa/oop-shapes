package com.jcanepa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Shape[] shapes = {
            new Circle(4),
            new Square(5),
            new Rectangle(6, 4),
        };

        // Demonstrate polymorphism
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
            System.out.println("This shape is a " + shape.getShapeType());
            System.out.println(shape + "\n");
        }

        // Demonstrate sorting
        System.out.println("Sort the shapes by area:");
        Arrays.sort(shapes);
        Arrays.stream(shapes).forEach(System.out::println);
    }
}
