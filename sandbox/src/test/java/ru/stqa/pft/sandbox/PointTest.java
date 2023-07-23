package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testDistance1() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Assert.assertEquals(p1.distanceTo(p2),2.8284271247461903);
        Assert.assertNotEquals(p1.distanceTo(p2),0);
    }
    @Test
    public void testDistance2() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Assert.assertNotEquals(p1.distanceTo(p2),0);
    }
}