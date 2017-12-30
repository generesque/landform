package com.landform.landscape;

import java.util.Set;

public interface Landscape {

    double getHeight(Point point);
    double getWaterDepth(Point point);

    Set<Region> getRegions();
    Set<Path> getPaths();
    Set<PointOfInterest> getPointsOfInterest();
}
