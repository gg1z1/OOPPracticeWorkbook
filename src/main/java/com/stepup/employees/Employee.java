package com.stepup.employees;

public class Employee {

    private String name;
    private Department department;

    public Employee(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя сотрудника не может быть пустым");
        }
        this.name = name;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {

        return new Department(department.getName());
    }

    Department getDepartmentEnc() {
        return this.department;
    }

    // Метод установки отдела
    public void setDepartment(Department department) {
        if (department != null && department.getChiefEnc() == this) {
            throw new IllegalStateException("Начальник отдела не может быть обычным сотрудником другого отдела");
        }
        this.department = department;
    }

    @Override
    public String toString() {
        if (department == null) {
            return name + " не работает ни в одном отделе";
        }

        if (department.getChiefEnc() == this) {
            return name + " начальник отдела " + department.getName();
        } else {
            Employee chief = department.getChiefEnc();
            if (chief != null) {
                return name + " работает в отделе " + department.getName() +
                        ", начальник которого " + chief.getName();
            } else {
                return name + " работает в отделе " + department.getName();
            }
        }
    }
}
