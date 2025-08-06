package com.stepup.mains;

import com.stepup.geometry.lines.Measurable;

public class MainPolymorphismLines {

    public static void main(String[] args) {
//        //задание 1
//        // Создаем точку в трехмерном пространстве
//        Point3D point3D = new Point3D(10, 20, 30);
//
//        // Выводим все координаты
//        System.out.println("Координаты точки: " + point3D);
//
//        // Получаем отдельные координаты
//        int x = point3D.getX();
//        int y = point3D.getY();
//        int z = point3D.getZ();
//
//        System.out.println("X: " + x);
//        System.out.println("Y: " + y);
//        System.out.println("Z: " + z);
//
//        // Создаем еще одну точку
//        Point3D anotherPoint = new Point3D(-5, 0, 15);
//        System.out.println("Вторая точка: " + anotherPoint);
//
//        //Задание 2-6
//        //Задаём точки
//        Point p1 = new Point(1, 5);
//        Point p2 = new Point(2, 8);
//        Point p3 = new Point(5, 3);
//        Point p4 = new Point(8, 9);
//
//        //Делаем незамкнутую ломанаю
//        PolyLine polyLine = new PolyLine(p1, p2, p3, p4);
//        ClosedPolyLine cpl = new ClosedPolyLine(p1, p2, p3, p4);
//
//
//        System.out.println("количество точек: " + cpl.getPointsCount());
//
//        // Выводим начальную информацию
//        System.out.println("Незамкнутая ломаная: " + polyLine);
//        // Длинна не замкнутой ломаной
//        System.out.println("Длина незамкнутой ломаной: " + polyLine.getLength());
//
//        // Выводим начальную информацию
//        System.out.println("Замкнутая ломаная: " + cpl);
//        //Длинна замкнутой ломаной
//        System.out.println("Длинна замкнутой ломаной: " + cpl.getLength());
//
//        Line ln = new Line(p1, p2);
//        Line ln2 = new Line(p2, p3);
//        Line ln3 = new Line(p3, p4);
//        Line ln4 = new Line(p4, p1);
//
//
//        Measurable[] objects = {new StringAdapter("123456"), ln,ln2,ln3,ln4, polyLine, cpl};
//        measureLength(objects);
//
        //задание 7
        System.out.println("Результат первого сложения: " + sumAll(2, 3/5, 2.3));
        System.out.println("Результат второго сложения: " + sumAll(3.6, 49/12, 3, 3.0/2));
        System.out.println("Результат третьего сложения: " + sumAll(1.0/3, 1));

    }

    public static void measureLength(Measurable[] objects) {
        for (Measurable obj : objects) {
            System.out.println("Длина объекта: " + obj.getLength());
        }
    }

    public static double sumAll(double... numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

}
