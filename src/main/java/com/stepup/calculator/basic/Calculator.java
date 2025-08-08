package com.stepup.calculator.basic;


import com.stepup.calculator.operations.Operation;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Calculator {

    public int calculate(Operation operation, int a, int b) {
        return operation.calculate(a, b);
    }

    public double sumAll(Number... numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double power(String xStr, String yStr) {
        // Преобразуем строки в числа
        int x = parseInt(xStr);
        int y = parseInt(yStr);

        // Возводим в степень и возвращаем результат
        return pow(x, y);
    }
}