package com.stepup.education.students;

import com.stepup.education.rules.*;

import java.util.ArrayList;
import java.util.List;


public final class Student {
    String name;
    private List<Integer> grades = new ArrayList<>();
    private Rule rule;


    public Student(String name, Rule rule) {
        this.name = name;
        this.rule = rule;
    }

    public Student(String name) {
        this(name, new RuleTwoFive());
    }
    public void addGrade(int grade){
        if(rule.check(grade)) grades.add(grade);
    }

    public String toString() {
        return "Student{" + " grades =" + grades + ", name=" + name + '}';
    }
}