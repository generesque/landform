package com.landform.landscape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;


public class PointTest {

    @Test
    public void constructorTest() {
        Point point = new Point(0, 1);
        assertEquals(0, point.getX(), 0);
        assertEquals(1, point.getY(), 0);

        point = new Point();
        assertEquals(0, point.getX(), 0);
        assertEquals(0, point.getY(), 0);
    }

    @Test
    public void hashCodeTest() {
        Point a = new Point(0.25, 0.75);
        Point b = new Point(0.25, 0.75);
        Point c = new Point(0.35, 0.75);

        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a.hashCode(), c.hashCode());
    }

    @Test
    public void toStringTest() {
        Point a = new Point(0.25, 0.75);
        Point b = new Point(0.25, 0.75);
        Point c = new Point(0.35, 0.75);

        assertEquals(a.toString(), b.toString());
        assertNotEquals(a.toString(), c.toString());
    }

    @Test
    public void outOfBoundsTest() {
        try {
            new Point(-1, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            new Point(0, -0.1);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            new Point(1.5, 0);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }

        try {
            new Point(0, 1.2);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            //pass
        }
    }

    @Test
    public void equalsTest() {
        Point a = new Point(0.5, 0.5);
        Point b = new Point(0.5, 0.5);
        Point c = new Point(0.5, 0.67);
        Point d = new Point(0.21, 0.5);
        Point e = new Point(d);

        assertEquals(a, b);
        assertEquals(d, e);
        assertNotEquals(a, c);
        assertNotEquals(a, d);
        assertNotEquals(null, a);
    }
}
