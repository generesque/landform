package com.landform.landscape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class LandscapeSquareTest {

    @Test
    public void unitLandscapeSquareTest() {
        LandscapeSquare landscapeSquare = new LandscapeSquare(1, 1);
        landscapeSquare.setHeight(0, 0, 0.5);

        assertEquals(0.5, landscapeSquare.getHeight(new Point(0, 0)), 0.0);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(1, 1)), 0.0);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(0.5, 0.5)), 0.0);
    }

    @Test
    public void interpolationTest() {
        LandscapeSquare landscapeSquare = new LandscapeSquare(2, 2);
        landscapeSquare.setHeight(0, 0, 0);
        landscapeSquare.setHeight(1, 0, 0.5);
        landscapeSquare.setHeight(0, 1, 0.5);
        landscapeSquare.setHeight(1, 1, 1.0);

        assertEquals(0, landscapeSquare.getHeight(new Point(0, 0)), 0.0);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(1, 0)), 0.0);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(0, 1)), 0.0);
        assertEquals(1, landscapeSquare.getHeight(new Point(1, 1)), 0.0);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(0.5, 0.5)), 0.0);
        assertEquals(0.25, landscapeSquare.getHeight(new Point(0.25, 0.25)), 0.0001);
        assertEquals(0.75, landscapeSquare.getHeight(new Point(0.75, 0.75)), 0.0001);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(0.25, 0.75)), 0.0001);
        assertEquals(0.5, landscapeSquare.getHeight(new Point(0.75, 0.25)), 0.0001);
    }

    @Test
    public void getHeightTest() {
        LandscapeSquare landscapeSquare = new LandscapeSquare(2, 2);

        assertEquals(0, landscapeSquare.getHeight(0, 0), 0);
        assertEquals(0, landscapeSquare.getHeight(1, 0), 0);
        assertEquals(0, landscapeSquare.getHeight(0, 1), 0);
        assertEquals(0, landscapeSquare.getHeight(1, 1), 0);

        landscapeSquare.setHeight(0, 0, 0.5);
        assertEquals(0.5, landscapeSquare.getHeight(0, 0), 0);
        assertEquals(0, landscapeSquare.getHeight(1, 0), 0);
        assertEquals(0, landscapeSquare.getHeight(0, 1), 0);
        assertEquals(0, landscapeSquare.getHeight(1, 1), 0);


    }

    @Test
    public void outOfBoundsTest() {
        LandscapeSquare landscapeSquare = new LandscapeSquare(10, 10);

        try {
            landscapeSquare.setHeight(-1, 0, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.setHeight(0, -1, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.setHeight(10, 0, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.setHeight(0, 10, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.getHeight(-1, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.getHeight(0, -1);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.getHeight(10, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            landscapeSquare.getHeight(0, 10);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }
    }
}
