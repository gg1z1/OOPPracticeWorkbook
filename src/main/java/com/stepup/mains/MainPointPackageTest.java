package com.stepup.mains;


import com.stepup.geometry.points.simple.Point;
//import java.awt.Point;

public class MainPointPackageTest {
    public static void main(String[] args) {
//        Point p1 = new Point(1, 1);
//        java.awt.Point p2 = new java.awt.Point(1,0);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 1);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false

        Point cloned = (Point) p1.clone();
        System.out.println(p1 == cloned); // false
        System.out.println(p1.equals(cloned)); // true
    }
}
