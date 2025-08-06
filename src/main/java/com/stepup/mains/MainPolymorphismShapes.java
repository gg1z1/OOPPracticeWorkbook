package com.stepup.mains;

import com.stepup.geometry.points.simple.Point;
import com.stepup.geometry.shapes.Circle;
import com.stepup.geometry.shapes.Rectangle;
import com.stepup.geometry.shapes.Shape;
import com.stepup.geometry.shapes.Square;

public class MainPolymorphismShapes {
    public static void main(String[] args){

        // Создаем фигуры
        Shape circle = new Circle(new Point(0, 0), 1);
        Shape square = new Square(new Point(0, 0), 4);
        Shape rectangle = new Rectangle(new Point(0, 0), 3, 6);

        // Выводим площади
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

        Shape[] shapes = new Shape[] {circle,square,rectangle};

        // Выводим площади отдельных фигур
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Площадь фигуры " + (i + 1) + " " + shapes[i].getClass().getSimpleName() + ": " + shapes[i].getArea());
        }

        // Считаем общую площадь
        double totalArea = sumAllAreas(shapes);
        System.out.println("\nОбщая площадь всех фигур: " + totalArea);

    }

    public static double sumAllAreas(Shape[] shapes) {
        if (shapes == null) {
            throw new NullPointerException("Массив фигур не может быть null");
        }

        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}
