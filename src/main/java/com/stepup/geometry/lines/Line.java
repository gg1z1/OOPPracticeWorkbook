package com.stepup.geometry.lines;

import com.stepup.geometry.points.simple.Point;

import java.util.Objects;

public class Line implements Measurable , Cloneable{
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

    public Point getStart() {
        return new Point(start.getX(),start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(),end.getY());
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(),start.getY());;
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(),end.getY());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line tmpLine = (Line) o;
        return Objects.equals(start, tmpLine.start) && Objects.equals(end, tmpLine.end);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (start != null ? start.hashCode() : 0);
        hash = 31 * hash + (end != null ? end.hashCode() : 0);
        return hash;
    }

    @Override
    public Object clone() {
        try {
            Line clonedLine = (Line) super.clone();
            // Выполняем копирование точек безопасно (через приметив)
            clonedLine.start = (Point) start.clone();
            clonedLine.end = (Point) end.clone();
            return clonedLine;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}