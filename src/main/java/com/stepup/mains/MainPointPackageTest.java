package com.stepup.mains;


import com.stepup.geometry.lines.ClosedPolyLine;
import com.stepup.geometry.lines.Line;
import com.stepup.geometry.lines.PolyLine;
import com.stepup.geometry.points.simple.Point;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
//import java.awt.Point;

public class MainPointPackageTest {
    public static void main(String[] args) {
//        Point p1 = new Point(1, 1);
//        java.awt.Point p2 = new java.awt.Point(1,0);
//
//        Point p1 = new Point(1, 2);
//        Point p2 = new Point(1, 2);
//        Point p3 = new Point(2, 1);
//
//        System.out.println(p1.equals(p2)); // true
//        System.out.println(p1.equals(p3)); // false
//
//        Point cloned = (Point) p1.clone();
//        System.out.println(p1 == cloned); // false
//        System.out.println(p1.equals(cloned)); // true
//        // Создаем тестовые точки
//        Point p1 = new Point(1, 2);
//        Point p2 = new Point(3, 4);
//        Point p3 = new Point(5, 6);
//
//        // Создаем линии
//        Line line1 = new Line(p1, p2);
//        Line line2 = new Line(p1, p2);
//        Line line3 = new Line(p2, p3);
//
//        testEquals(line1, line2, line3);
//        testHashCode(line1, line2, line3);
//        testClone(line1);
//        testDeepClone(line1);

        // Создаем тестовые точки
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(3, 3);

        // Тестирование базового сравнения
        testEqualsSamePoints(p1, p2, p3);
        testEqualsDifferentPoints(p1, p2, p3, p4);
        testEqualsDifferentSize(p1, p2);
        testEqualsNull();
        testHashCodeSamePoints(p1, p2);

        testBasicFunctionality();
        testClosure();
        testMinimumPoints();
        testClone();
        testInheritance();
    }

    private static void testEquals(Line line1, Line line2, Line line3) {
        System.out.println("Тестирование equals:");
        System.out.println("line1.equals(line2) = " + line1.equals(line2)); // true
        System.out.println("line1.equals(line3) = " + line1.equals(line3)); // false
        System.out.println("line1.equals(line1) = " + line1.equals(line1)); // true
        System.out.println("line1.equals(null) = " + line1.equals(null)); // false
        System.out.println("line1.equals(new Object()) = " + line1.equals(new Object())); // false
        System.out.println();
    }

    private static void testHashCode(Line line1, Line line2, Line line3) {
        System.out.println("Тестирование hashCode:");
        System.out.println("hashCode line1: " + line1.hashCode());
        System.out.println("hashCode line2: " + line2.hashCode());
        System.out.println("hashCode line3: " + line3.hashCode());
        System.out.println("line1.hashCode() == line2.hashCode(): " +
                (line1.hashCode() == line2.hashCode())); // должно быть true
        System.out.println();
    }

    private static void testClone(Line line) {
        System.out.println("Тестирование clone:");
        Line cloned = (Line) line.clone();

        System.out.println("line == cloned: " + (line == cloned)); // false
        System.out.println("line.equals(cloned): " + line.equals(cloned)); // true
        System.out.println();
    }

    private static void testDeepClone(Line line) {
        System.out.println("Тестирование глубокого клонирования:");
        Line cloned = (Line) line.clone();

        // Проверяем, что точки разные объекты
        System.out.println("line.start == cloned.start: " +
                (line.getStart() == cloned.getStart())); // false
        System.out.println("line.end == cloned.end: " +
                (line.getEnd() == cloned.getEnd())); // false

        // Проверяем значения
        System.out.println("line.start.equals(cloned.start): " +
                line.getStart().equals(cloned.getStart())); // true
        System.out.println("line.end.equals(cloned.end): " +
                line.getEnd().equals(cloned.getEnd())); // true

        // Проверяем независимость - не имеет смысла, т.к. Объект полностью инкапсулирован
        //System.out.println("Проверка независимости после изменения:");
        //System.out.println("line.start.x: " + line.getStart().getX()); // должно быть старое значение
        //System.out.println("cloned.start.x: " + cloned.getStart().getX()); // новое значение
    }

    private static void testEqualsSamePoints(Point... points) {
        PolyLine poly1 = new PolyLine(points);
        PolyLine poly2 = new PolyLine(points);

        boolean result = poly1.equals(poly2);
        System.out.println("Тест равных ломаных: " + (result ? "Пройден" : "Не пройден"));
    }

    private static void testEqualsDifferentPoints(Point... points1) {
        Point[] points2 = Arrays.copyOf(points1, points1.length);
        points2[points2.length - 1] = new Point(99, 99); // Меняем последнюю точку

        PolyLine poly1 = new PolyLine(points1);
        PolyLine poly2 = new PolyLine(points2);

        boolean result = !poly1.equals(poly2);
        System.out.println("Тест разных ломаных: " + (result ? "Пройден" : "Не пройден"));
    }

    private static void testEqualsDifferentSize(Point... points) {
        PolyLine poly1 = new PolyLine(points);
        PolyLine poly2 = new PolyLine(points[0]);

        boolean result = !poly1.equals(poly2);
        System.out.println("Тест разного размера: " + (result ? "Пройден" : "Не пройден"));
    }

    private static void testEqualsNull() {
        PolyLine poly = new PolyLine();
        boolean result = !poly.equals(null);
        System.out.println("Тест сравнения с null: " + (result ? "Пройден" : "Не пройден"));
    }

    private static void testHashCodeSamePoints(Point... points) {
        PolyLine poly1 = new PolyLine(points);
        PolyLine poly2 = new PolyLine(points);

        boolean result = poly1.hashCode() == poly2.hashCode();
        System.out.println("Тест hashCode: " + (result ? "Пройден" : "Не пройден"));
    }
    private static void testBasicFunctionality() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        ClosedPolyLine line = new ClosedPolyLine(p1, p2, p3);

        // Проверяем базовое поведение
        System.out.println("Базовые тесты: " +
                (line.getPointsCount() == 3 && line.getLength() > 0 ? "Пройден" : "Не пройден"));
    }

    private static void testClosure() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        ClosedPolyLine line = new ClosedPolyLine(p1, p2, p3);
        List<Line> lines = line.getLines();

        // Проверяем, что добавлена замыкающая линия
        System.out.println("Тест замыкания: " +
                (lines.size() != 3 ||
                        !lines.get(2).getStart().equals(p1) ||
                        !lines.get(2).getEnd().equals(p3) ? "Не пройден" : "Пройден"));
    }

    private static void testMinimumPoints() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        // Проверяем поведение при недостаточном количестве точек
        ClosedPolyLine line1 = new ClosedPolyLine(p1, p2);
        System.out.println("Тест минимального количества точек (2): " +
                (line1.getLines().size() == 1 ? "Пройден" : "Не пройден"));

        ClosedPolyLine line2 = new ClosedPolyLine(p1);
        System.out.println("Тест минимального количества точек (1): " +
                (line2.getLines().isEmpty() ? "Пройден" : "Не пройден"));
    }

    private static void testClone() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        ClosedPolyLine original = new ClosedPolyLine(p1, p2, p3);
        ClosedPolyLine cloned = (ClosedPolyLine) original.clone();

        // Проверяем независимость клонов
        System.out.println("Тест клонирования: " +
                (original != cloned &&
                        original.equals(cloned) &&
                        original.getLines().size() == cloned.getLines().size() ? "Пройден" : "Не пройден"));
    }

    private static void testInheritance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        ClosedPolyLine closedLine = new ClosedPolyLine(p1, p2, p3);
        PolyLine baseLine = closedLine;

        // Проверяем корректность наследования
        System.out.println("Тест наследования: " +
                (baseLine instanceof ClosedPolyLine &&
                        closedLine instanceof PolyLine ? "Пройден" : "Не пройден"));
    }
}


