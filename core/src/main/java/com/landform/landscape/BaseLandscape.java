package com.landform.landscape;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseLandscape implements Landscape {
    private Set<Region> regions = new HashSet<>();
    private Set<Path> paths = new HashSet<>();
    private Set<PointOfInterest> pointOfInterests = new HashSet<>();

    @Override
    public Set<Region> getRegions() {
        return regions;
    }

    @Override
    public Set<Path> getPaths() {
        return paths;
    }

    @Override
    public Set<PointOfInterest> getPointsOfInterest() {
        return pointOfInterests;
    }
}
