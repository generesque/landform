package com.landform.landscape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PointOfInterest that = (PointOfInterest) o;
        return Objects.equals(point, that.point);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), point);
    }

    @Override
    public String toString() {
        return "PointOfInterest{" +
                "point=" + point +
                "} " + super.toString();
    }
}
