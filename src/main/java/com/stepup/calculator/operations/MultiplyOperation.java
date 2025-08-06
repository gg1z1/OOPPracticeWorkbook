package com.stepup.calculator.operations;

// Реализация умножения
public class MultiplyOperation implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}