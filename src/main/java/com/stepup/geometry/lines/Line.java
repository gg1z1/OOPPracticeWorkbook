package com.stepup.geometry.lines;

import com.stepup.geometry.points.simple.Point;

public class Line implements Measurable {
    //Координата начала (класса Точка)
    private Point start;
    //Координата конца (класса Точка)
    private Point end;

    // Конструктор (инициализатор)
    // С указанием двух Точек
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор (инициализатор)
    // С указанием 4х точек
    public Line(int x_start, int y_start, int x_end, int y_end) {
        new Line(new Point(x_start, y_start), new Point(x_end, y_end));
    }

    //Метод Может вернуть длину Линии
    public double getLength() {
        //Расчет длинны катетов (из конца вычитываем начало)
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        //Для извлечения корня можно использовать Math.sqrt.
        return Math.sqrt(dx * dx + dy * dy);
    }

    // перегруженная toString
    // Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}