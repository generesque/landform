package com.landform.landscape;

import java.util.ArrayList;
import java.util.List;

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
}
