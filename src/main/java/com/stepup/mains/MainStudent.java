package com.stepup.mains;

import com.stepup.education.rules.RuleChet;
import com.stepup.education.students.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainStudent {
    public static void main(String[] args) {
        // Создаем студента с правилом оценок 2-5
        Student student1 = new Student("Иван");
        // добавится
        student1.addGrade(3);
        student1.addGrade(4);
        student1.addGrade(5);
        // не добавится
        student1.addGrade(1);

        // Создаем студента с правилом четных чисел
        Student student2 = new Student("Петр", new RuleChet());
        // добавится
        student2.addGrade(4);
        student2.addGrade(20);
        student2.addGrade(100000);
        // не добавится
        student2.addGrade(5);
        student2.addGrade(100001);

        System.out.println(student1);
        System.out.println(student2);
    }
}
