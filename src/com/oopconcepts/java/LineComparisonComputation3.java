package com.oopconcepts.java;

class Point2 {
    private final int x;
    private final int y;

    public Point2(int x, int y) {
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

class Line2 implements Comparable<Line2> {
    public final Point startPoint;
    public final Point endPoint;

    public Line2(Point startPoint, Point endPoint) {
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

    public int compareTo(Line2 otherLine) {
        double length1 = this.calculateLength();
        double length2 = otherLine.calculateLength();

        if (length1 < length2) {
            return -1;
        } else if (length1 > length2) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class LineComparisonComputation3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");


        Point startPoint1 = new Point(1, 2);
        Point endPoint1 = new Point(4, 6);
        Line2 line1 = new Line2(startPoint1, endPoint1);

        Point startPoint2 = new Point(2, 3);
        Point endPoint2 = new Point(5, 7);
        Line2 line2 = new Line2(startPoint2, endPoint2);


        int comparisonResult = line1.compareTo(line2);

        if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is equal to Line 2.");
        }
    }
}

