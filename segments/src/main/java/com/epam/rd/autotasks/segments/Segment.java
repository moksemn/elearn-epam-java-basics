package com.epam.rd.autotasks.segments;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null)
            throw new IllegalArgumentException();
        if (start.equals(end))
            throw new IllegalArgumentException();
        this.start = start;
        this.end = end;
    }

    public double length() {
        double x1 = start.getX();
        double x2 = end.getX();
        double y1 = start.getY();
        double y2 = end.getY();
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    public Point middle() {
        double x1 = start.getX();
        double x2 = end.getX();
        double y1 = start.getY();
        double y2 = end.getY();
        double x = (x1 + x2) / 2.0;
        double y = (y1 + y2) / 2.0;
        return new Point(x, y);
    }

    public Point intersection(Segment another) {
        double x1 = this.start.getX();
        double x2 = this.end.getX();
        double y1 = this.start.getY();
        double y2 = this.end.getY();
        double x3 = another.start.getX();
        double x4 = another.end.getX();
        double y3 = another.start.getY();
        double y4 = another.end.getY();
        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denominator == 0) {
            return null; // Отрезки коллинеарны
        }
        double px = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
        double py = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;

        if (       px >= Math.min(x1, x2) && px <= Math.max(x1, x2)
                && py >= Math.min(y1, y2) && py <= Math.max(y1, y2)
                && px >= Math.min(x3, x4) && px <= Math.max(x3, x4)
                && py >= Math.min(y3, y4) && py <= Math.max(y3, y4)) {
            return new Point(px, py);
        } else {
            return null;
        }

    }
}


