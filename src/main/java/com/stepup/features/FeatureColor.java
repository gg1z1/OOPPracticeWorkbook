package com.stepup.features;

public class FeatureColor extends Feature {
    public FeatureColor(String value) {
        super("Цвет", value);
    }

    @Override
    public String toString() {
        return ", " + value.replace("ый", "ого") + " цвета";
    }
}
