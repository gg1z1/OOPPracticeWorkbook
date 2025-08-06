package com.stepup.education.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentEnc {
    // Приватные поля для инкапсуляции данных
    private String name;
    private List<Integer> grades;

    // Главный конструктор
    public StudentEnc(String name, List<Integer> initialGrades) {
        if (Objects.equals(name, "")) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        // Проверяем и добавляем начальные оценки
        for (int grade : initialGrades) {
            addGradeEnc(grade);
        }
    }

    //Конструктор для создания без оценок
    public StudentEnc(String name) {
        this(name, new ArrayList<>());
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод для добавления оценки с валидацией
    public void addGrade(int grade) {
        addGradeEnc(grade);
    }

    // Метод для добавления оценки с валидацией
    private void addGradeEnc(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
        grades.add(grade);
    }

    // Метод для получения всех оценок
    public List<Integer> getGrades() {
        // Возвращаем копию списка для защиты от изменения извне
        return new ArrayList<>(grades);
    }

    // Переопределенный метод toString
    @Override
    public String toString() {
        return "Имя: " + name + " [" + String.join(", ", grades.stream()
                .map(String::valueOf)
                .toArray(String[]::new)) + "]";
    }
}