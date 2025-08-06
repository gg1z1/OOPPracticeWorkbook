package com.stepup.mains;

import com.stepup.features.FeatureColor;
import com.stepup.features.FeatureTime;
import com.stepup.geometry.points.custom.PointBuilder;
import com.stepup.geometry.points.custom.PointCustom;

public class MainCustomPoint{
    public static void main(String[] args) {

        PointCustom point1 = new PointBuilder()
                .addCoordinate(3)
                .addFeature(new FeatureColor("красный") )
                .build();

        PointCustom point2 = new PointBuilder()
                .addCoordinate(4)
                .addCoordinate(2)
                .addCoordinate(5)
                .addFeature(new FeatureTime("11:00"))
                .build();

        PointCustom point3 = new PointBuilder()
                .addCoordinate(7)
                .addCoordinate(7)
                .addFeature(new FeatureColor("желтый"))
                .addFeature(new FeatureTime("15:35") )
                .build();

        point1.displayInfo();
        point2.displayInfo();
        point3.displayInfo();

    }
}
