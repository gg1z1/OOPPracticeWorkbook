package com.stepup.geometry.lines;

import com.stepup.geometry.points.simple.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolyLine implements Measurable {
    // Выбрал List т.к. с ним удобнее работать через дженерик points
    // Честно я поверхностно понимаю как работает дженерик,
    // но с List я работал именно в таком ключе
    private List<Point> points;

    // Конструктор без параметров
    public PolyLine() {
        this.points = new ArrayList<>();
    }

    // Конструктор с начальным набором точек
    public PolyLine(Point... points) {

        this.points = new ArrayList<>();
        Collections.addAll(this.points, points);
    }

    // Метод добавления точки
    // Удобно же?
    public void addPoint(Point point) {
        points.add(point);
    }

    // Метод получения списка линий
    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();

        // Проверяем, достаточно ли точек для создания линии
        // минимум 2 точки должно быть, иначе пустой массив возвращаем
        if (points.size() < 2) {
            return lines;
        }

        // Создаем линии между соседними точками (в порядке их соседства в массиве).
        // Ну типо через индекс берём из массива текущее и следующее значение
        for (int i = 0; i < points.size() - 1; i++) {
            Line line = new Line(points.get(i), points.get(i + 1));
            lines.add(line);
        }
        return lines;
    }

    // Метод получения длины ломаной
    // foreach понятное здесь подходит для суммирования всех длин.
    public double getLength() {
        double totalLength = 0;
        for (Line line : getLines()) {
            //считаем всё через сумму квадратов катетов внутри Line и суммируем
            totalLength += line.getLength();
        }
        return totalLength;
    }

    // Переопределенный метод toString
    // StringBuilder - тоже раньше использовал, удобная вещь.
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Линия [");

        // добавляем в строчечку все элементы массивчика через ","
        // при этом помним, что внутри append происходит преобразование в строку
        // По этому class Point переопределяет автоматом toString перегрузкой
        for (int i = 0; i < points.size(); i++) {

            sb.append(points.get(i));
            sb.append(",");
        }
        //отрезаем последнюю запятую
        sb.deleteCharAt(sb.length() - 1);

        //закрываем скобочку
        sb.append("]");

        return sb.toString();
    }

    protected Point getPoint(int index) {
        return points.get(index);
    }

    protected int getPointsCount() {
        return points.size();
    }
}
