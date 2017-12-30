package com.landform.renderer;

import com.landform.landscape.Landscape;

import java.awt.image.RenderedImage;
import java.util.Collection;

public interface Renderer {
    Collection<String> getSupportedRegionTypes();
    Collection<String> getSupportedPathTypes();
    Collection<String> getSupportedPointOfInterestTypes();

    RenderedImage render(Landscape landscape, int width, int height);
}
