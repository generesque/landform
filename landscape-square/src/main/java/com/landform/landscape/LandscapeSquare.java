package com.landform.landscape;

public class LandscapeSquare extends BaseLandscape {
    private int width;
    private int height;
    private double[][] heightMap;

    public LandscapeSquare(int width, int height) {
        super();
        this.width = width;
        this.height = height;
        this.heightMap = new double[width][height];
    }

    private void validateCoordinates(int x, int y) {
        if (x < 0 || x >= width) {
            throw new IllegalArgumentException(String.format("Invalid X coordinate %d, [0, %d]", x, width));
        }
        if (y < 0 || y >= height) {
            throw new IllegalArgumentException(String.format("Invalid Y coordinate %d, [0, %d]", y, height));
        }
    }

    public double getHeight(int x, int y) {
        validateCoordinates(x, y);
        return heightMap[x][y];
    }

    public void setHeight(int x, int y, double value) {
        validateCoordinates(x, y);
        heightMap[x][y] = value;
    }

    @Override
    public double getHeight(Point point) {
        double xIndex = (width - 1) * point.getX();
        double yIndex = (height - 1) * point.getY();

        double lowerX = Math.floor(xIndex);
        double upperX = Math.ceil(xIndex);
        double lowerY = Math.floor(yIndex);
        double upperY = Math.ceil(yIndex);
        double xPercent = xIndex - lowerX;
        double yPercent = yIndex - lowerY;

        double value = 0;
        value += heightMap[(int) Math.round(lowerX)][(int) Math.round(lowerY)] * ((1.0 - xPercent) * (1.0 - yPercent));
        value += heightMap[(int) Math.round(upperX)][(int) Math.round(lowerY)] * ((xPercent) * (1.0 - yPercent));
        value += heightMap[(int) Math.round(lowerX)][(int) Math.round(upperY)] * ((1.0 - xPercent) * (yPercent));
        value += heightMap[(int) Math.round(upperX)][(int) Math.round(upperY)] * ((xPercent) * (yPercent));

        return value;
    }

    @Override
    public double getWaterDepth(Point point) {
        return 0;
    }

}
