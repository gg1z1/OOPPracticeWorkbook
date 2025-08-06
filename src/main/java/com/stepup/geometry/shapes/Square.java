package com.stepup.geometry.shapes;


import com.stepup.geometry.points.simple.Point;

public class Square implements Shape{
    // Приватные поля класса - для инкапсуляции, но не final потому что могут меняться
    // Левый верхний угол
    private Point topLeft;
    // Длина стороны
    private int sideLength;
    
    //конструктор базовый
    public Square(Point topLeft, int sideLength) {
        if (topLeft == null) {
            throw new NullPointerException("Точка верхнего левого угла не может быть null");
        }
        
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
        setSide(sideLength);
    }
    
    // Конструктор через координаты
    public Square(int x, int y, int sideLength) {
        this(new Point(x,y),sideLength);
    }
    

    // Геттер для точки с инкапсуляцией (копированием)
    public Point getPoint() {
        return new Point(topLeft.getX(), topLeft.getY()); // Безопасный возврат копии
    }

    // Сеттер для точки с проверкой на null, why not?
    // Через инкапсуляцию - задаём новую ссылку.
    public void setPoint(Point newPoint) {
        if (newPoint == null) {
            throw new IllegalArgumentException("Точка не может быть null");
        }
        this.topLeft = new Point(newPoint.getX(), newPoint.getY());
    }

    // Геттер для длины стороны
    // Инкапсуляция для примитивов не требует специального копирования
    public int getSideLength() {
        return sideLength;
    }

    // Сеттер для длины
    // Публичный сеттер - заправляется через приватный
    public void setSideLength(int sideLength) {
        setSide(sideLength);
    }

    // Приватный метод с проверкой ограничения
    private void setSide(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной");
        }
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
    // Метод для получения строкового представления
    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + sideLength;
    }
}