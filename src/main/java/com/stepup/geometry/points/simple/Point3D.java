package com.stepup.geometry.points.simple;

public class Point3D extends Point {
    // Добавляем третье измерение
    private final int z;

    // Конструктор с тремя параметрами
    public Point3D(int x, int y, int z) {
        // Вызываем конструктор родительского класса
        super(x, y);
        this.z = z;
    }

    // Геттер для координаты Z
    public int getZ() {
        return z;
    }

    // Переопределяем метод toString()
    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + z + "}";
    }
}
