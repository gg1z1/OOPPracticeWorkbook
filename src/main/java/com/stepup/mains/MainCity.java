package com.stepup.mains;

import com.stepup.logistic.cities.City;

public class MainCity {
    public static void main(String[] args) {
    //        //задание 1
    //        // Создаем три объекта точки
    //        Point point1 = new Point(1, 3);
    //        Point point2 = new Point(1, 3);
    //        Point point3 = new Point(5, 8);
    //
    //        // Выводим текстовое представление точек
    //        // Кстати я зауглил почему не нужно писать .toString() - компилятор сам подставляет
    //        System.out.println("Точка 1: " + point1);    // {1;3}
    //        System.out.println("Точка 2: " + point2);    // {1;3}
    //        System.out.println("Точка 3: " + point3);    // {5;8}
    //
    //        // Сравниваем точки между собой
    //        // Отдельный метод для проверки - сверки не реализовывал, производим проверку ссылок
    //        //логично что везде false
    //        System.out.println("Сравнение point1 и point2: " + (point1==point2)); // false
    //        System.out.println("Сравнение point1 и point3: " + (point1==point3)); // false
    //        System.out.println("Сравнение point2 и point3: " + (point2==point3)); // false

    //        //задание 2
    //        // Создаем точки
    //        Point start_point1_line1 = new Point(1, 3);
    //        Point end_point2_line1 = new Point(5, 8);
    //
    //        Point start_point3_line2 = new Point(10, 11);
    //        Point end_point4_line2 = new Point(15, 19);
    //
    //
    //
    //        // Создаем линии, передавая объекты Point
    //        Line line1 = new Line(start_point1_line1, end_point2_line1);
    //        Line line2 = new Line(start_point3_line2, end_point4_line2);
    //
    //
    //        Line line3 = new Line(end_point2_line1, start_point3_line2);
    //
    //        // Выведите текстовое представление Линии 3 на экран
    //        // Выводим текстовое представление линии 3
    ////        System.out.println("Исходное состояние линии 1: " + line1);
    ////        System.out.println("Исходное состояние линии 2: " + line2);
    //        System.out.println("Исходное состояние линии 3: " + line3);
    //
    //        // Создаем новые точки для изменения линии 3
    //        Point newStart = new Point(0, 0);
    //        Point newEnd = new Point(10, 10);
    //
    //        // Измените координаты точек начала и конца Линии 3 таким образом, чтобы изменились все три объекта Линии
    //        // Изменяем координаты линии 3 и конец 1ой линии и начало 2ой линии,
    //        // если я правильно понял задание, то через изменение первоначально созданных точек
    //        end_point2_line1.setPoint(newStart);
    //        start_point3_line2.setPoint(newEnd);
    //
    //
    //        // Выводим измененное состояние линии 3
    ////        System.out.println("Измененное состояние линии 1: " + line1);
    ////        System.out.println("Измененное состояние линии 2: " + line2);
    //        System.out.println("Измененное состояние линии 3: " + line3);
    //
    //        // Рассчитываем суммарную длину
    //        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
    //        System.out.println("Суммарная длина всех линий: " + totalLength);
    //        //задание 3
    //        // 1. Создаем Ломаную, проходящую через заданные точки
    //        Point p1 = new Point(1, 5);
    //        Point p2 = new Point(2, 8);
    //        Point p3 = new Point(5, 3);
    //        Point p4 = new Point(8, 9);
    //
    //        PolyLine polyLine = new PolyLine(p1, p2, p3, p4);
    //
    //        // Выводим начальную информацию
    //        System.out.println("Начальная ломаная: " + polyLine);
    //
    //        // 2. Рассчитываем длину Ломаной
    //        double polyLength = polyLine.getLength();
    //        System.out.println("Длина ломаной: " + polyLength);
    //
    //        // 3. Получаем массив Линий?
    //        List<Line> lines = polyLine.getLines();
    //
    //        // 4. Рассчитываем длину массива Линий
    //        double linesLength = 0;
    //        linesLength += new Line(p1, p2).getLength();
    //        linesLength += new Line(p2, p3).getLength();
    //        linesLength += new Line(p3, p4).getLength();
    //
    //        // 5. Сравниваем длины
    //        System.out.println("Общая длина линий: " + linesLength);
    //        System.out.println("Длины совпадают: " + (polyLength == linesLength));
    //
    //        // Проверка длин всех линий до изменений
    //        System.out.println("Линии до изменения:");
    //        for (Line line : lines) {
    //            System.out.println("Линия: " + line + ", длина: " + line.getLength());
    //        }
    //
    //        // 6. Изменяем координаты точки {2,8} на {12,8}
    //        p2.setX(12);
    //
    //        // Проверяем изменения
    //        System.out.println("После изменения 2ой точки:");
    //        System.out.println("Ломаная: " + polyLine);
    //
    //        // Проверка длин всех линий после изменений
    //        System.out.println("Линии после изменения:");
    //        for (Line line : lines) {
    //            System.out.println("Линия: " + line + ", длина: " + line.getLength());
    //        }
    //
    //            System.out.println("Изменились 2 линии т.к. у них общая точка которая изменена");
    //            System.out.println("Не изменились 3 линия т.к. у неё нет общей изменённой точки");
        //задание 4
        // Создаем города
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // Настраиваем связи между городами
        //A
        A.addConnection(F, 1);
        A.addConnection(D, 6);
        A.addConnection(B, 5);
        //B
        B.addConnection(A, 5);
        B.addConnection(C, 3);
        //C
        C.addConnection(D, 4);
        C.addConnection(B, 3);
        //D
        D.addConnection(E, 2);
        D.addConnection(C, 4);
        D.addConnection(A, 6);
        //E
        E.addConnection(F, 2);
        //F
        F.addConnection(B, 1);
        F.addConnection(E, 2);

        // Проверяем работу метода travelBy
        System.out.println("От B - 1 шаг - смотрим куда можно идти: " + B.travelBy(1)); // A или C
        System.out.println("От B - 2 шага - смотрим куда можно идти: " + B.travelBy(2)); // B, D или F
        System.out.println("От B - 3 шага - смотрим куда можно идти: " + B.travelBy(3)); // Зависит от порядка
        System.out.println("От B - 4 шага - смотрим куда можно идти: " + B.travelBy(4)); // Зависит от порядка
        System.out.println("От B - 5 шага - смотрим куда можно идти: " + B.travelBy(5)); // Зависит от порядка
        System.out.println("От B - 6 шага - смотрим куда можно идти: " + B.travelBy(6)); // Зависит от порядка
        System.out.println("От B - 7 шага - смотрим куда можно идти: " + B.travelBy(7)); // Зависит от порядка




        System.out.println("----------------------------------: чистим пути строим новые :----------------------------"); // Зависит от порядка
        // Настраиваем порядок для получения A после 3 шагов
        B.clearConnections();
        B.addConnection(C, 3);
        C.clearConnections();
        C.addConnection(A, 4);
        A.clearConnections();
        A.addConnection(B, 1);
        System.out.println("----------------------------------: повторяем маршрут от B :----------------------------"); // Зависит от порядка

        System.out.println("От B - 1 шаг - смотрим куда можно идти: " + B.travelBy(1)); // A или C
        System.out.println("От B - 2 шага - смотрим куда можно идти: " + B.travelBy(2)); // B, D или F
        System.out.println("От B - 3 шага - смотрим куда можно идти: " + B.travelBy(3)); // Зависит от порядка
        System.out.println("От B - 4 шага - смотрим куда можно идти: " + B.travelBy(4)); // Зависит от порядка
        System.out.println("От B - 5 шага - смотрим куда можно идти: " + B.travelBy(5)); // Зависит от порядка


    }
}
