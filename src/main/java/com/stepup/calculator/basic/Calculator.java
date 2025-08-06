package com.stepup.calculator.basic;


import com.stepup.calculator.operations.Operation;

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
}