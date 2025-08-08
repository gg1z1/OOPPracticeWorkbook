package com.stepup.cooking.components;

public class Sauce {
    // Тип соуса и параметр остроты
    private String name;
    private HotnessLevel hotness;

    // Конструктор
    public Sauce(String name, HotnessLevel hotness) {
        this.name = name;
        this.hotness = hotness;
    }

    // Метод для получения текстового представления
    @Override
    public String toString() {
        return "Соус " + name.toUpperCase() + ": " + hotness.getDescription().toUpperCase();
    }
}