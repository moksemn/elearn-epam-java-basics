package com.epam.rd.autotasks.triangle;

class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        if (point1.equals(point2) || point1.equals(point3) || point3.equals(point2)) {
            throw new IllegalArgumentException();
        }
        if (point1 == null || point2 == null || point3 == null) {
            throw new IllegalArgumentException();
        }
        if (point1.getX() == point2.getX() &&
                point2.getX() == point3.getX() &&
                point3.getX() == point1.getX()) {
            throw new IllegalArgumentException();
        }
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    public Point centroid() {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        double centroidX = (x1 + x2 + x3) / 3.0;
        double centroidY = (y1 + y2 + y3) / 3.0;
        return new Point(centroidX, centroidY);
    }
}


