package com.stepup.geometry.shapes;

import com.stepup.geometry.points.simple.Point;

public class Circle implements Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным числом");
        }
        if (center == null) {
            throw new IllegalArgumentException("Точка не может быть null");
        }
        this.center = center;
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с центром в точке " + center + " с радиусом " + radius;
    }
}
