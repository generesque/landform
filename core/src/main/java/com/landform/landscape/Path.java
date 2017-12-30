package com.landform.landscape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An open path defined by its component points
 */
public class Path extends Feature {
    private ArrayList<Point> points;

    public Path(String type)
    {
        super(type);
        this.points = new ArrayList<>();
    }

    public Path(String type, List<Point> points)
    {
        super(type);
        this.points = new ArrayList<>(points);
    }

    public Path(Path other)
    {
        super(other);
        this.points = new ArrayList<>(other.points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Path path = (Path) o;
        return Objects.equals(points, path.points);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), points);
    }

    @Override
    public String toString() {
        return "Path{" +
                "points=" + points +
                "} " + super.toString();
    }
}
