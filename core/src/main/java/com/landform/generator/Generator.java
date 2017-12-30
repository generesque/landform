package com.landform.generator;

import com.landform.landscape.Landscape;

import java.util.Collection;

public interface Generator {
    Collection<String> getSupportedRegionTypes();
    Collection<String> getSupportedPathTypes();
    Collection<String> getSupportedPointOfInterestTypes();

    Landscape generate();
}
