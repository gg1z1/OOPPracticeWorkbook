package com.stepup.geometry.points.custom;

import com.stepup.features.Feature;

import java.util.ArrayList;
import java.util.List;

public class PointCustom {

    private List<Integer> coordinates;
    private  List<Feature> features = new ArrayList<>();

    public PointCustom(List<Integer> coordinates) {
        this.coordinates = coordinates;
    }

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public void displayInfo() {
        buildInfo();
    }

    private void buildInfo() {
        StringBuilder info = new StringBuilder();
        if(coordinates.size()>1) {
            info.append("Точка в координате {");
            for (int i = 0; i < coordinates.size(); i++) {
                info.append(coordinates.get(i));
                if (i < coordinates.size() - 1) {
                    info.append(",");
                }
            }
            info.append("}");
        } else {
            info.append("Точка в координате ");
            info.append(coordinates.get(0));
        }

        for (Feature feature : features) {
            if (feature.getClass().getSimpleName().contains("Time"))
                info.append(feature.toString());
        }

        for (Feature feature : features) {
            if(!feature.getClass().getSimpleName().contains("Time"))
            info.append(feature.toString());
        }

        System.out.println(info.toString());

    }


}
