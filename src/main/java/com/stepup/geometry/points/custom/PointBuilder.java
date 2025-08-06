package com.stepup.geometry.points.custom;

import com.stepup.features.Feature;

import java.util.ArrayList;
import java.util.List;

public class PointBuilder {
    private List<Integer> coordinates = new ArrayList<>();
    private List<Feature> features = new ArrayList<>();
    int coordinateCount = 0;

    public PointBuilder addCoordinate(int coordinate) {
        if (coordinateCount > 2) {
            throw new IllegalStateException("Нельзя добавить больше 3 координат");
        }
        coordinateCount++;
        coordinates.add(coordinate);
        return this;
    }

    public PointBuilder addFeature(Feature customFeature) {
        features.add(customFeature);
        return this;
    }

    public PointCustom build() {
        PointCustom point = new PointCustom(coordinates);
        for (Feature feature : features) {
            point.addFeature(feature);
        }
        return point;
    }
}
