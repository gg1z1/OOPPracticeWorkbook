package com.stepup.features;

// Конкретные реализации характеристик
public class FeatureTime extends Feature {
    public FeatureTime(String value) {
        super("Время", value);
    }

    @Override
    public String toString() {
        return " в " + value;
    }
}
