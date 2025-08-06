package com.stepup.features;

public abstract class Feature {
    protected String name;
    protected String value;

    public Feature(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public abstract String toString();
}