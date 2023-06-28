package com.oopconcepts.java;

class Point1 {
    private final int x;
    private final int y;

    public Point1(int x, int y) {
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

class Line1 {
    private final Point1 startPoint;
    private final Point1 endPoint;

    public Line1(Point1 startPoint, Point1 endPoint) {
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

    public boolean equals(Line2 otherLine) {
        return this.startPoint.equals(otherLine.startPoint) && this.endPoint.equals(otherLine.endPoint);
    }
}

public class LineComparisonComputation2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");


        Point1 startPoint1 = new Point1(1, 2);
        Point1 endPoint1 = new Point1(4, 6);
        Line2 line1 = new Line2(startPoint1, endPoint1);

        Point1 startPoint2 = new Point1(2, 3);
        Point1 endPoint2 = new Point1(5, 7);
        Line2 line2 = new Line2(startPoint2, endPoint2);


        boolean areEqual = line1.equals(line2);

        if (areEqual) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }
}