package com.landform.landscape;

import java.util.ArrayList;
import java.util.List;

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
}
