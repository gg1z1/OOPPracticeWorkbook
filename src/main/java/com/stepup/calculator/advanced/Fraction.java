package com.stepup.calculator.advanced;

public class Fraction extends Number {
    // Приватные финальные поля для инкапсуляции
    private final int numerator;
    private final int denominator;

    // Конструктор с проверкой знаменателя
    public Fraction(int numerator, int denominator) {
        //знаменатель не может быть меньше/равен 0 по условиям задачи
        if (denominator == 0) throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        //числитель, знаменатель
        this.numerator = numerator;
        this.denominator = denominator;
        System.out.println("Создание дроби: " + numerator + "/" + denominator);
    }

    // Метод для сложения с дробью
    public Fraction sum(Fraction other) {
        System.out.println("Пример : (" +  this.numerator + "*" + other.denominator + "+" + other.numerator + "*" + this.denominator + ")/ (" + this.denominator +"*"+ other.denominator + ")");
        // числитель одной дроби умножается на знаменатель другой - приведение к общему знаменателю
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        // момент инкапсуляции - создаём новую копию объекта.

        System.out.println("Результат суммирования: " + newNumerator + "/" + newDenominator);
        return new Fraction(newNumerator, newDenominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Метод для вычитания дроби
    public Fraction minus(Fraction other) {

        System.out.println("Пример : (" +  this.numerator + "*" + other.denominator + "-" + other.numerator  + "*" +  this.denominator + ")/ (" + this.denominator +"*"+ other.denominator + ")");
        // числитель одной дроби умножается на знаменатель другой - приведение к общему знаменателю
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        System.out.println("Результат вычитания: " + newNumerator + "/" + newDenominator);
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для вычитания целого числа
    public Fraction minus(int number) {
        //целое число можно представить как знаменатель дробь 1
        return this.minus(new Fraction(number, 1));
    }

    // Метод для вычитания целого числа
    public Fraction sum(int number) {
        //целое число можно представить как знаменатель дробь 1
        return this.sum(new Fraction(number, 1));
    }



    // Метод строкового представления
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return (int) (numerator / (double) denominator);
    }

    @Override
    public long longValue() {
        return (long) (numerator / (double) denominator);
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + numerator;
        hash = 31 * hash + denominator;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null||getClass() != obj.getClass()) return false;

        final Fraction other = (Fraction) obj;
        return numerator == other.numerator
                && denominator == other.denominator;
    }

    //Используем защитное копирование, т.к. поля определены как final
    @Override
    protected Object clone() {
            // Создаем новый объект того же класса
            return new Fraction(this.numerator,this.denominator);
    }
}