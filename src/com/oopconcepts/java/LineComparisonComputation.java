package com.oopconcepts.java;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Line {
    private final Point1 startPoint;
    private final Point1 endPoint;

    public Line(Point1 startPoint, Point1 endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        int x1 = startPoint.getX();
        int y1 = startPoint.getY();
        int x2 = endPoint.getX();
        int y2 = endPoint.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");


        Point1 startPoint = new Point1(1, 2);
        Point1 endPoint = new Point1(4, 6);


        Line2 line = new Line2(startPoint, endPoint);


        double length = line.calculateLength();

        System.out.println("Length of the line: " + length);
    }
}