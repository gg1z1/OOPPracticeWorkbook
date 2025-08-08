package com.stepup.cooking.components;

public enum HotnessLevel {
    //инициализируем значения остроты через приватный конструктор
    VERY_HOT("очень острый"),
    HOT("острый"),
    NOT_HOT("не острый");

    private String description;

    //приватный конструктор
    HotnessLevel(String description) {
        this.description = description;
    }

    //публичный метод для получения описания остроты
    public String getDescription() {
        return description;
    }
}
