package com.stepup.geometry.shapes;


import com.stepup.geometry.points.simple.Point;

public class Rectangle implements Shape {

    private Point topLeft;
    private int width;
    private int height;

    public Rectangle(Point topLeft, int width, int height) {
        if (width <= 0 || height <= 0 ) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной");
        }
        if (topLeft == null) {
            throw new NullPointerException("Точка верхнего левого угла не может быть null");
        }
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник в точке " + topLeft + " со шириной " + width + " и высотой " + height;
    }
}
