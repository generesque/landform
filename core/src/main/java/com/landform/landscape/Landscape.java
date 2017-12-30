package com.landform.landscape;

import java.util.Collection;

public interface Landscape {

    double getHeight(double x, double y);
    double getWaterDepth(double x, double y);

    Collection<Region> getRegions();
    Collection<Path> getPaths();
    Collection<PointOfInterest> getPointsOfInterest();
}
