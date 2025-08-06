package com.stepup.mains;

import com.stepup.employees.Department;
import com.stepup.employees.Employee;

public class MainEmployee
{
    public static void main(String[] args) {
//        //задание 1
//        // Создаем дроби
//        Fraction f1 = new Fraction(1, 3);    // 1/3
//        Fraction f2 = new Fraction(2, 5);    // 2/5
//        Fraction f3 = new Fraction(7, 8);    // 7/8
//
//        // Выполняем последовательные операции
//        Fraction result = f1.sum(f2).sum(f3).minus(5);
//
//
//        // Выводим результат
//        System.out.println("Результат: " + result);
//
//        //Fraction f4 = new Fraction(7, -8);    // 7/8
//        /*
//        * Exception in thread "main" java.lang.IllegalArgumentException: Знаменатель должен быть положительным
//	        at com.stepup.check.Fraction.<init>(Fraction.java:11)
//	        at com.stepup.practice.com.stepup.check.Main.main(com.stepup.check.Main.java:12)
//        * */
//        //задание 2
//        Square square = new Square(1, 2, 5);
//        System.out.println(square);  // Квадрат в точке {1;2} со стороной 5
//
//        square.setSideLength(10);
//        System.out.println(square);  // Квадрат в точке {1;2} со стороной 10
//
//        square.setUpperLeftCorner(new Point(3, 4));
//        System.out.println(square);  // Квадрат в точке {3;4} со стороной 10
//
//        // Создание квадрата
//        Square square_2 = new Square(1, 2, 5);
//        System.out.println(square_2);
//        // Изменение положения - нельзя изменить точку, только задать новую точку
//        /*square_2.getUpperLeftCorner().setX(3); // Изменение координаты X
//        square_2.getUpperLeftCorner().setY(4); // Изменение координаты Y*/
//        square_2.setUpperLeftCorner(new Point(5, 6)); // Установка новой точки
//        System.out.println(square_2);
//
//        // Изменение длинны можно через квадрат
//        square_2.setSideLength(10); // Установка новой длины стороны
//        System.out.println(square_2);
//        // Получение текущих значений - геттер работает корректно.
//        int x = square_2.getUpperLeftCorner().getX();
//        int y = square_2.getUpperLeftCorner().getY();
//        int side = square_2.getSideLength();
//        System.out.println("Параметры квадрата через геттер: Точка " + "{" + x + ";" + y + "}" + ", длинна " + side);
//        //задание 3
//        //Имя пустое - ошибка
//        //Student student = new Student("");
//        // Создание студента без начальных оценок
//        Student student1 = new Student("Петя Петров");
//        System.out.println(student1); // Имя: Петя Петров []
//        student1.addGrade(4);
//        student1.addGrade(5);
//        student1.setName("Петя Иванов");
//
//        // Создание студента с начальными оценками
//        List<Integer> initialGrades = List.of(3, 4, 5);
//        Student student2 = new Student("Вася Сидоров", initialGrades);
//
//        System.out.println(student1); // Имя: Петя Иванов [4, 5]
//        System.out.println(student2); // Имя: Вася Сидорова [3, 4, 5]
        //задание 4
        // Создаём начальника
        Employee boss = new Employee("Иван Петров");
        Department accountDept = new Department("Бухгалтерия");
        boss.setDepartment(accountDept);
        accountDept.setChief(boss);

        Employee stepanEmployee = new Employee("Степан Разин");
        stepanEmployee.setDepartment(accountDept);

        Employee annaEmployee = new Employee("Анна Сидорова");
        Department cloudDep = new Department("Отдел облаков");
        annaEmployee.setDepartment(cloudDep);
        //accountDept.setChief(annaEmployee);
        //cloudDep.setChief(boss);
        //boss.setDepartment(cloudDep);

        Employee test_1 = accountDept.getChief();
        test_1.setDepartment(new Department("Отдел блинчиков"));
        test_1.setName("Пётр Блинчиков");

        // Выводим информацию
        System.out.println(boss);    // Иван Петров начальник отдела Бухгалтерия
        System.out.println(stepanEmployee);    // Степан Разин работает в отделе Бухгалтерия, начальник которого Иван Петров
        System.out.println(annaEmployee); // Анна Сидорова работает в отделе Отдел облаков
        System.out.println(test_1); // Анна Сидорова работает в отделе Отдел облаков
    }
}
