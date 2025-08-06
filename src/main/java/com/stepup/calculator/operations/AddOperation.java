package com.stepup.calculator.operations;

public class AddOperation implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
