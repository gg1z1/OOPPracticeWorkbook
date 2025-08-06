package com.stepup.employees;

public class Department {
    private String name;
    private Employee chief;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        this.name = name;
    }

    public Employee getChief() {
        return new Employee(chief.getName());
    }

    Employee getChiefEnc() {
        return this.chief;
    }



    // Метод установки начальника отдела
    public void setChief(Employee chief) {
        // Проверка, что сотрудник работает в этом отделе
        if (chief.getDepartmentEnc() != this) {
            throw new IllegalArgumentException("Сотрудник должен работать в этом отделе, прежде чем стать начальником");
        }

        this.chief = chief;
    }
}