package com.epam.rd.autotasks.intersection;

public class Line {
    private int a;
    private int b;

    public Line(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.a == other.a) {
            return null;
        } else {
            int x = (other.b - this.b) /(this.a-other.a);
            int y = this.a * x + this.b;
            return new Point(x, y);
        }
    }
}
