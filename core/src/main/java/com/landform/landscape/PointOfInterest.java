package com.landform.landscape;

/**
 * A specific point of interest
 */
public class PointOfInterest extends Feature{
    private Point point;

    public PointOfInterest(String type)
    {
        super(type);
        this.point = new Point();
    }

    public PointOfInterest(String type, Point point)
    {
        super(type);
        this.point = point;
    }

    public PointOfInterest(PointOfInterest other)
    {
        super(other);
        this.point = other.point;
    }
}
