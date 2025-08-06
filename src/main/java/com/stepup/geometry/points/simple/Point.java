package com.stepup.geometry.points.simple;

public class Point {
    // Поля класса
    // Хороший тон - private final что бы нельзя было менять
    private final int  x;
    private final int y;

    // Конструктор (инициализатор)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    // Метод для получения строкового представления
    // Хороший тон - аннотация для понимания, что метод Object.toString() перегружен
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }


}
