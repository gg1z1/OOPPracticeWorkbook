package com.stepup.geometry.lines;

import com.stepup.geometry.points.simple.Point;

import java.util.List;

public class ClosedPolyLine extends PolyLine{

    public ClosedPolyLine() {
        super();
    }

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public List<Line> getLines() {
        List<Line> lines = super.getLines();
        //В замкнутой линии должно быть более 3х точек
        if (super.getPointsCount() < 3) {
            return lines;
        }
        lines.add(new Line(getPoint(0),getPoint( super.getPointsCount()- 1)));
        return lines;
    }


}
