package com.landform.landscape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A closed region defined by its encircling points
 */
public class Region extends Feature{
    private ArrayList<Point> points;

    public Region(String type)
    {
        super(type);
        this.points = new ArrayList<>();
    }

    public Region(String type, List<Point> points)
    {
        super(type);
        this.points = new ArrayList<>(points);
    }

    public Region(Region other)
    {
        super(other);
        this.points = new ArrayList<>(other.points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Region region = (Region) o;
        return Objects.equals(points, region.points);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), points);
    }

    @Override
    public String toString() {
        return "Region{" +
                "points=" + points +
                "} " + super.toString();
    }
}
