package com.landform.landscape;

import java.util.Objects;

/**
 * A 2D point whose components are within the range [0, 1]
 */
final public class Point {
    final private double x;
    final private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        if (x < 0 || x > 1.0) {
            throw new IllegalArgumentException(String.format("Invalid X coordinate: %d", x));
        }
        if (y < 0 || y > 1.0) {
            throw new IllegalArgumentException(String.format("Invalid Y coordinate: %d", y));
        }

        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
