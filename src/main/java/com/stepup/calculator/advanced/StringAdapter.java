package com.stepup.calculator.advanced;

import com.stepup.geometry.lines.Measurable;

public class StringAdapter implements Measurable {
    private String str;

    public StringAdapter(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}